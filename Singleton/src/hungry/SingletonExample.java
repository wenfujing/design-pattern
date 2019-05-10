package hungry;

/**
 * @author yuanweimin
 * @date 19/05/10 09:33
 * @description 饿汉模式
 * 初始化时加载
 */


public class SingletonExample {
    private SingletonExample() {
    }

    private static SingletonExample instance = new SingletonExample();

    public static SingletonExample getInstance() {
        return instance;
    }
}
