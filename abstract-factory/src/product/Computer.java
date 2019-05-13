package product;

/**
 * @author yuanweimin
 * @date 19/05/13 09:21
 * @description 电脑产品
 */
public class Computer implements Product {
    @Override
    public void use() {
        System.out.println("use Computer ...");
    }
}
