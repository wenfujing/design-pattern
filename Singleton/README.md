# 单例模式

- [懒汉式](src/lazy/SingletonExample.java)

> 线程安全，无需同步，调用效率高
> 单例实例在类装载时进行创建，不能延时加载

```Java
@ThreadSafe
public class SingletonExample {
    private SingletonExample() {
    }

    private static SingletonExample instance = new SingletonExample();

    public static SingletonExample getInstance() {
        return instance;
    }
}
```

```Java
@ThreadSafe
public class SingletonExample {
    private SingletonExample() {
    }

    private static SingletonExample instance = null;

    static {
        instance = new SingletonExample();
    }

    public static SingletonExample getInstance() {
        return instance;
    }
}
```



- 饿汉式

> 延时加载，资源利用率高
>
> 每次获取实例都要同步，并发效率低

```Java
@ThreadSafe
public class SingletonExample {
    private SingletonExample() {
    }

    private static SingletonExample instance = null;

    public static synchronized SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
}
```



- 双重检测锁

> 懒汉式 + 双重检测锁
>
> 由于编译器优化和JVM内部模型原因，偶尔会出现问题，不建议使用
>
> 可通过volatile关键字禁止指令重排实现线程安全

```Java
@NotThreadSafe
@NotRecommend
public class SingletonExample {
    private SingletonExample() {
    }

    private static SingletonExample instance = null;

    // 1. 分配对象的内存空间
    // 2. 初始化对象
    // 3. 设置instance指向对象

    // JVM和CPU优化发生了指令重排 1 -> 2 -> 3 ===> 1 -> 3 -> 2

   public static SingletonExample getInstance() {
        if (instance == null) {
            synchronized (SingletonExample.class) {
                if (instance == null) {
                    instance = new SingletonExample();
                }
            }
        }
        return instance;
    }
}
```

```Java
@ThreadSafe
public class SingletonExample {
    private SingletonExample() {
    }

    // 单例对象 volatile + 双重检测机制 -> 禁止指令重排
    private volatile static SingletonExample instance = null;

    public static SingletonExample getInstance() {
        if (instance == null) {
            synchronized (SingletonExample.class) {
                instance = new SingletonExample();
            }
        }
        return instance;
    }
}
```



- 静态内部类

> 延时加载
>
> 只有真正调用getInstance()才会加载静态内部类
>
> 兼备并发效率高和延时加载，推荐使用

```Java
public class SingletonExample {
    private SingletonExample() {}
    
    private static class SingletonInstance {
        private static final SingletonExample instance = new SingletonExample();
    }
    
    public static SingletonExample getInstance() {
        return SingletonInstance.instance;
    }
}
```


- 枚举

> 实现简单，可以避免反射和反序列化的漏洞
>
> 不能延时加载

```Java
@Recommend
@ThreadSafe
public class SingletonExample {
    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {
        INSTANCE;

        private SingletonExample singleton;

        // JVM保证这个方法绝对只调用一次
        Singleton() {
            singleton = new SingletonExample();
        }

        public SingletonExample getInstance() {
            return singleton;
        }
    }
}
```
