package innerclass;

import annotations.Recommend;
import annotations.ThreadSafe;

/**
 * @author yuanweimin
 * @date 19-5-10
 * @describe 静态内部类
 * 延时加载
 */

@Recommend
@ThreadSafe
public class SingletonExample {
    private SingletonExample() {
    }

    private static class SingletonInstance {
        private static final SingletonExample INSTANCE = new SingletonExample();
    }

    public static SingletonExample getInstance() {
        return SingletonInstance.INSTANCE;
    }
}