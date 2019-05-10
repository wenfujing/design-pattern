package enummodel;

import annotations.Recommend;
import annotations.ThreadSafe;

/**
 * @author yuanweimin
 * @date 19-5-10
 * @describe 单例实现
 * 线程安全，可以避免反射和反序列化的漏洞
 */
@Recommend
@ThreadSafe
public class SingletonExample {
    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {
        /**
         * 单例实例
         */
        INSTANCE;

        private SingletonExample singleton;

        /**
         * JVM保证这个方法绝对只调用一次
         */
        Singleton() {
            singleton = new SingletonExample();
        }

        public SingletonExample getInstance() {
            return singleton;
        }
    }
}