package factory;

import product.Computer;
import product.Product;

/**
 * @author yuanweimin
 * @date 19/05/11 23:09
 * @description 
 */
public class ComputerFactory extends Factory {
    @Override
    public Product create() {
        return new Computer();
    }
}
