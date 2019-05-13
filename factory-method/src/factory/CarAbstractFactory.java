package factory;

import product.Car;

/**
 * @author yuanweimin
 * @date 19/05/11 23:09
 * @description 
 */
public class CarAbstractFactory extends AbstractFactory {
    @Override
    public Car create() {
        return new Car();
    }
}
