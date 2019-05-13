package simple;

import java.io.*;

/**
 * @author yuanweimin
 * @date 19-5-13
 * @describe
 */
@SuppressWarnings("ALL")
public class UserPrototype implements Prototype, Serializable {
    private String name;
    private int age;
    private String sex;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserPrototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public UserPrototype clone() {
        UserPrototype user = null;
        try {
            user = (UserPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public UserPrototype deepClone() {
        UserPrototype user = null;
        ByteArrayOutputStream outByte = new ByteArrayOutputStream();
        try {
            ObjectOutputStream output = new ObjectOutputStream(outByte);
            output.writeObject(this);

            ByteArrayInputStream inByte = new ByteArrayInputStream(outByte.toByteArray());
            ObjectInputStream input = new ObjectInputStream(inByte);
            user = (UserPrototype) input.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return user;
    }
}
