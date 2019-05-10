package lazy;

import annotations.ThreadSafe;

/**
 * @author yuanweimin
 * @date 19/05/10 09:09
 * @description 懒汉式单例设计模式
 * 延迟加载
 */
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