import factory.CarAbstractFactory;
import factory.ComputerAbstractFactory;
import product.Car;
import product.Computer;

/**
 * @author yuanweimin
 * @date 19/05/13 08:22
 * @description
 */
public class Customer {
    public static void main(String[] args) {
        Car car = new CarAbstractFactory().create();
        car.use();

        Computer computer = new ComputerAbstractFactory().create();
        computer.use();
    }
}
