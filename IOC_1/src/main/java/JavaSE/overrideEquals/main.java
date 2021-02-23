package JavaSE.overrideEquals;

/**
 * 重写equals方法
 */

public class main {
    public static void main(String[] args) {
        Order o1 = new Order(1, "张三");
        Order o2 = new Order(1, "张三");
        System.out.println(o1.equals(o2));

        myDate d1 = new myDate(2021, 2, 8);
        myDate d2 = new myDate(2022, 2, 8);
        System.out.println(d1.equals(d2));
    }
}
