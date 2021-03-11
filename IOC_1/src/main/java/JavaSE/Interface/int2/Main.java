package JavaSE.Interface.int2;

/**
 * 接口的使用方法：
 * 1、implement
 * 2、接口的实现类必须覆盖重写（实现）接口中所有的抽象方法。
 * 3、实现：去掉abstract关键字，加上方法体大括号。
 * 4‘创建实现类的对象，进行使用。
 * */
public class Main implements Dog{
    @Override
    public void eat() {
        System.out.println("开始吃东西");
    }

    @Override
    public void jump() {
        System.out.println("开始跳起来");
    }

    public static void main(String[] args) {
        // 接口不能使用new
//        Dog dog = new Dog();
        Main dog = new Main();
        dog.jump();
        dog.eat();
    }
}
