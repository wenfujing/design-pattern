import factory.CarFactory;
import factory.ComputerFactory;
import product.Product;

public class Customer {
    public static void main(String[] args) {
        Product car = new CarFactory().create();
        car.use();

        Product computer = new ComputerFactory().create();
        computer.use();
    }
}
