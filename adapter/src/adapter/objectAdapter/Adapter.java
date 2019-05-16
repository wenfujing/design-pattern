package adapter.objectAdapter;

/**
 * @author yuanweimin
 * @date 19/05/16 15:41
 * @description 
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
