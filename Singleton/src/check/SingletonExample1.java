package check;

import annotations.ThreadSafe;

/**
 * @author yuanweimin
 * @date 19/05/10 10:03
 * @description 双重检测锁
 * 用 volatile 禁止指令重排
 */

@ThreadSafe
public class SingletonExample1 {
    private SingletonExample1() {
    }

    /**
     * 单例对象 volatile + 双重检测机制 -> 禁止指令重排
     */
    private volatile static SingletonExample1 instance = null;

    public static SingletonExample1 getInstance() {
        if (instance == null) {
            synchronized (SingletonExample.class) {
                instance = new SingletonExample1();
            }
        }
        return instance;
    }
}