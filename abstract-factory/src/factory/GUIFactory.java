package factory;

import product.Button;

/**
 * @author yuanweimin
 * @date 19/05/10 11:18
 * @description 界面工厂接口
 */
public interface GUIFactory {
    Button createButton();
}
