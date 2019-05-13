package factory;

import product.Computer;

/**
 * @author yuanweimin
 * @date 19/05/13 09:21
 * @description 电脑工厂
 */
public class ComputerFactory implements Factory {
    @Override
    public Computer createProd() {
        return new Computer();
    }
}
