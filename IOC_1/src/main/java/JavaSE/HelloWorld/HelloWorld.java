package JavaSE.HelloWorld;

public class HelloWorld {

    public static void main(String[] args) {
        myFunction.xiaomingInfo();
        myFunction.xiaowangInfo();
        myFunction.showHello();

        // 方法的可变个数的参数
        String[] kb = new String[]{"你好", "我是", "可变", "个数的。。。"};
        myFunction.kebian(kb);
        myFunction.kebian2(kb);

        // 方法的参数传递（类似于数据结构里是否改变方法里的变量数值、C指针）
        // 类中的a的值会变化
        testSwap a = new testSwap();
        testSwap.swapT(a);

        // 封装与隐藏
        封装与隐藏 fengzhuang = new 封装与隐藏();
        fengzhuang.setAge(-100);
        fengzhuang.printAge();
        int ageF = fengzhuang.getAge();
        System.out.println(ageF);
        fengzhuang.setAge(50);
        fengzhuang.printAge();
        ageF = fengzhuang.getAge();
        System.out.println(ageF);

        //类的构造方法
        animals ani1 = new animals();
        animals ani2 = new animals("Cat", 2);
        ani1.showInfo();
        ani2.showInfo();
    }
}