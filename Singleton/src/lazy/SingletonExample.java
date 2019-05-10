package lazy;

import annotations.ThreadSafe;

/**
 * @author yuanweimin
 * @date 19/05/10 09:09
 * @description 懒汉式单例设计模式
 */

@ThreadSafe
public class SingletonExample {
    private SingletonExample() {
    }

    private static SingletonExample instance = new SingletonExample();

    public static SingletonExample getInstance() {
        return instance;
    }
}
