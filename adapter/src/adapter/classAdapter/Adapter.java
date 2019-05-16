package adapter.classAdapter;

/**
 * @author yuanweimin
 * @date 19/05/16 15:41
 * @description 
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.specificRequest();
    }
}
