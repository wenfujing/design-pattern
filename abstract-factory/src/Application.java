import factory.MacFactory;
import factory.WinFactory;
import product.MacButton;
import product.WinButton;

/**
 * @author yuanweimin
 * @date 19/05/10 08:59
 * @description 抽象工厂模式
 */
public class Application {
    public static void main(String[] args) {
        MacFactory macFactory = new MacFactory();
        MacButton macButton = macFactory.createButton();
        macButton.click();

        WinFactory winFactory = new WinFactory();
        WinButton winButton = winFactory.createButton();
        winButton.click();
    }
}
