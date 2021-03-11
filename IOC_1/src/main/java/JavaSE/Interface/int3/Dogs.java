package JavaSE.Interface.int3;

public class Dogs implements Animals {
    @Override
    public void jump() {
        System.out.println("狗狗跳起来了！");
    }

    @Override
    public void eat() {
        System.out.println("狗狗在吃午餐！");
    }

    @Override
    public void swim() {
        System.out.println("狗狗在游泳！");
    }

    @Override
    public void sleep() {
        System.out.println("狗狗睡着了！");
    }

    @Override
    public void show() {
        System.out.println("小狗狗");
    }
}
