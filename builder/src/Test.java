import builder.Car;
import builder.User;

/**
 * @author yuanweimin
 * @date 19/05/13 08:54
 * @description 测试 Builder 模式
 */
public class Test {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .name("张三")
                .age(21)
                .address("中国江西")
                .build();
        System.out.println(user);

        Car car = new Car.Builder()
                .type("宝马")
                .price("1000000")
                .maxSpeed("360km/h")
                .build();
        System.out.println(car);
    }
}
