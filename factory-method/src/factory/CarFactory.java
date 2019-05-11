package factory;

import product.Car;
import product.Product;

/**
 * @author yuanweimin
 * @date 19/05/11 23:09
 * @description 
 */
public class CarFactory extends Factory {
    @Override
    public Product create() {
        return new Car();
    }
}
