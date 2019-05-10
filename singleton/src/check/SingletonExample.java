package check;

import annotations.NotRecommend;
import annotations.NotThreadSafe;

/**
 * @author yuanweimin
 * @date 19/05/10 10:03
 * @description 双重检测锁
 * 可能发生指令重排导致线程不安全
 */
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
