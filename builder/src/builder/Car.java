package builder;

/**
 * @author yuanweimin
 * @date 19-5-13
 * @describe
 */
public class Car {
    final String type;
    final String price;
    final String maxSpeed;

    private Car(Builder builder) {
        type = builder.type;
        price = builder.price;
        maxSpeed = builder.maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                '}';
    }

    public static final class Builder {
        private String type;
        private String price;
        private String maxSpeed;

        public Builder() {
        }

        public Builder type(String val) {
            type = val;
            return this;
        }

        public Builder price(String val) {
            price = val;
            return this;
        }

        public Builder maxSpeed(String val) {
            maxSpeed = val;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
