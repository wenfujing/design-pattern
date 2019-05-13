package simple;

/**
 * @author yuanweimin
 * @date 19-5-13
 * @describe
 */
public class Client {
    public static void main(String[] args) {
        new Client().testClone(true);
        System.out.println("========================================" +
                "华丽的分割线==========================================");
        new Client().testClone(false);
    }

    private void testClone(boolean isDeep) {
        UserPrototype user = new UserPrototype();
        Address address = new Address();
        address.setStreet("文清路");
        address.setDoor("23号");
        user.setName("Alice");
        user.setAge(21);
        user.setSex("girl");
        user.setAddress(address);

        System.out.println(user);
        UserPrototype cloneUser;
        if (isDeep) {
            cloneUser = user.deepClone();
        } else {
            cloneUser = user.clone();
        }
        cloneUser.setName("Marry");
        cloneUser.getAddress().setStreet("中华路");
        cloneUser.getAddress().setDoor("33号");

        System.out.println(cloneUser);
        // 普通克隆方法修改了原来对象的内容
        // 深克隆则不会
        System.out.println(user);
    }
}
