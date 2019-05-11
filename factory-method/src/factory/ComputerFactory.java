package factory;

import product.Computer;

/**
 * @author yuanweimin
 * @date 19/05/11 23:12
 * @description 
 */
public class ComputerFactory extends Factory {
    @Override
    public Computer create() {
        return new Computer();
    }
}
