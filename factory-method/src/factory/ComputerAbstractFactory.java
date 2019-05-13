package factory;

import product.Computer;

/**
 * @author yuanweimin
 * @date 19/05/11 23:12
 * @description 
 */
public class ComputerAbstractFactory extends AbstractFactory {
    @Override
    public Computer create() {
        return new Computer();
    }
}
