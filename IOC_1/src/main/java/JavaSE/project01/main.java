package JavaSE.project01;

public class main {
    // 祖宗类
    public void test(Object obj) {
    }

    public static void main(String[] args) {
        // main函数
        Person p = new Person("小明", 12);
        p.showInfo();
        Student s = new Student("小红", 15, "红星");
        s.showInfo();
        Person a = new Student("小六", 11, "白帝");
        a.showInfo();

        // 判断s是否是Person类
        System.out.println(a instanceof Person);

        // 祖宗类
        main t = new main();
        t.test(new Student("小红", 15, "红星"));
        System.out.println(t.equals(a));
    }
}
