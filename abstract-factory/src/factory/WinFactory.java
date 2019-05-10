package factory;

import product.WinButton;

/**
 * @author yuanweimin
 * @date 19/05/10 11:23
 * @description
 */
public class WinFactory implements GUIFactory {

    @Override
    public WinButton createButton() {
        return new WinButton();
    }
}
