package JavaSE.InsideClass;

/**
 * 内部类
 * */

public class InsideClass {
    int a;
    public int b;
    private int c;

    class A{
        public void setInsideClassFileds(){
            InsideClass.this.a = 1;
            System.out.println("----------init----------");
        }
    }
    // static内部类不能使用非static外部类成员
    static class B{}
    final class C{}
    abstract class D{}

    public void setInfo(){
        // 外部类要想用自己内部类的方法，必须先new一个内部类的对象
        new A().setInsideClassFileds();
    }

    public void showInfo() {
        System.out.println("a = " + a);
    }
}

class A{
    public void testB(){
        new innerB().testB();
    }
    public void testC(){
        new innerC().testC();
    }

    private class innerB extends B{
        @Override
        public void testB(){
            System.out.println("testB方法被重写了！");
        }
    }
    private class innerC extends C{
        @Override
        public void testC(){
            System.out.println("testC方法被重写了！");
        }
    }
}
class B{
    public void testB(){}
}
class C{
    public void testC(){}
}

class Person{
    public String name;

    public Person() {
        this.name = "张三";
        System.out.println("这是构造方法");
    }

    {
        System.out.println("非静态代码块");
    }
}
