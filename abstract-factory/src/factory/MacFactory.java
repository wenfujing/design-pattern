package factory;

import product.MacButton;

/**
 * @author yuanweimin
 * @date 19/05/10 11:21
 * @description
 */
public class MacFactory implements GUIFactory {

    @Override
    public MacButton createButton() {
        return new MacButton();
    }
}
