package JavaSE.HelloWorld;

class Person {
    public String name;
    public int age;
    public boolean gender;

    public static String school = "帝丹小学";

    // 展示信息
    void showName(String name, boolean gender, int age) {
        if (gender) {
            System.out.println(name + "先生今年" + age + "岁。");
        } else {
            System.out.println(name + "小姐今年" + age + "岁");
        }
    }
}

class Student extends Person {
    public String className;
    public int id;
    public String mail;

    // 展示信息
    void showInfo(String name, boolean gender, int age, String className, int id, String mail) {
        if (gender) {
            System.out.println(name + "先生今年" + age + "岁。他目前在" + className + "，学号为" + id + "，电邮地址是" + mail + "。");
        } else {
            System.out.println(name + "小姐今年" + age + "岁。她目前在" + className + "，学号为" + id + "，电邮地址是" + mail + "。");
        }
    }
}

public class myFunction {
    // 打印欢迎界面
    protected static void showHello() {
        System.out.printf("欢迎使用Java！");
    }


    public static void xiaomingInfo() {
        Person p = new Person();
        p.name = "小明";
        p.age = 18;
        p.gender = false;
        p.showName(p.name, p.gender, p.age);
    }

    public static void xiaowangInfo() {
        Student s = new Student();
        s.name = "小王";
        s.age = 18;
        s.gender = true;
        s.className = "高三（1）";
        s.id = 20210101;
        s.mail = "ABC@Gmail.com";
        s.showName(s.name, s.gender, s.age);
        s.showInfo(s.name, s.gender, s.age, s.className, s.id, s.mail);
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(int a, int b, double c) {
        return a + b + c;
    }

    // 方法的可变个数的参数
    public static void kebian(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public static void kebian2(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}

// 栈内存与堆内存
class testSwap {
    public int a = 5;

    public static void swapT(testSwap x) {
        System.out.println("x.a的值为：" + x.a);
        x.a = 10;
        System.out.println("x.a的值为：" + x.a);
    }
}

// 封装和隐藏
class 封装与隐藏 {
    private int age;

    public void setAge(int a) {
        if (a < 0 || a >= 100)
            System.out.println("对不起，" + a + "岁的年龄不正确！");
        else age = a;
    }
    public int getAge(){return age;}
    public void printAge(){
        System.out.println("年龄是" + age + "岁。");
    }
}

// 类的构造方法
class animals {
    public String name;
    public int count;
    animals(int count){
        this.count = count;
    }
    // 无参构造方法
    animals(){
        this(6);  // 使用this必须放在首行
        name = "Dog";
        count = 5;
    }
    // 有参构造方法
    animals(String name, int count){
        this.name = name;
        this.count = count;
    }

    public void showInfo(){
        System.out.println(name);
        System.out.println(count);
    }
}

