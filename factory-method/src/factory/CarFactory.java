package factory;

import product.Car;

/**
 * @author yuanweimin
 * @date 19/05/11 23:09
 * @description 
 */
public class CarFactory extends Factory {
    @Override
    public Car create() {
        return new Car();
    }
}
