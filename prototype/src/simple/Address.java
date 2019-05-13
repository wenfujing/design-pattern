package simple;

import java.io.Serializable;

/**
 * @author yuanweimin
 * @date 19-5-13
 * @describe
 */
public class Address implements Serializable {
    private String street;
    private String door;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", door='" + door + '\'' +
                '}';
    }
}
