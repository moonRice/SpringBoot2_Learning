package JavaSE.Interface.int3;

public class Cats implements Animals {
    @Override
    public void jump() {
        System.out.println("猫咪跳起来了！");
    }

    @Override
    public void eat() {
        System.out.println("猫咪在吃午餐！");
    }

    @Override
    public void swim() {
        System.out.println("猫咪在游泳！");
    }

    @Override
    public void sleep() {
        System.out.println("猫咪睡着了！");
    }

    @Override
    public void show() {
        System.out.println("小猫咪");
    }
}
