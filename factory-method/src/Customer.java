import factory.CarFactory;
import factory.ComputerFactory;
import product.Car;
import product.Computer;

public class Customer {
    public static void main(String[] args) {
        Car car = new CarFactory().create();
        car.use();

        Computer computer = new ComputerFactory().create();
        computer.use();
    }
}
