package JavaSE.Interface.in1;

/**
 * 接口
 *
 * @author zheng
 * */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println("canFly.MAX_SPEED = " + canFly.MAX_SPEED);
    }
}

interface canFly{
    // 全局常量
    public static final int MAX_SPEED = 100;
    // 可以省略
    int MIN_SPEED = 1;

    public abstract void fly();
    void stop();
}
