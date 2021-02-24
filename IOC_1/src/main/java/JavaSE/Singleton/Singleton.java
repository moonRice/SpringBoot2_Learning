package JavaSE.Singleton;

/**
 * 在碰到实例化时，new上万个对象，会占用大量资源
 * 所以此处设计单例模式
 * 仅仅实例化一次
 */
public class Singleton {
    /**
     * 私有化构造方法
     */
    private Integer age;
    private String name;
    private String address;

    private Singleton() {
    }

    private static Singleton st = new Singleton();

    public static Singleton getInstance(Integer age, String name, String address) {
        st.age = age;
        st.name = name;
        st.address = address;
        return st;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
