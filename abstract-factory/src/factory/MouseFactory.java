package factory;

import product.Mouse;

/**
 * @author yuanweimin
 * @date 19/05/13 09:23
 * @description 鼠标工厂
 */
public class MouseFactory implements Factory {
    @Override
    public Mouse createProd() {
        return new Mouse();
    }
}
