package adapter.classAdapter;

/**
 * @author yuanweimin
 * @date 19/05/16 14:54
 * @description 
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
