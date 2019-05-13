import factory.*;
import product.*;

/**
 * @author yuanweimin
 * @date 19/05/13 09:26
 * @description 测试抽象工厂
 */
public class Application {
    public static void main(String[] args) {
        Computer computer = new ComputerFactory().createProd();
        computer.use();

        Mouse mouse = new MouseFactory().createProd();
        mouse.use();
    }
}
