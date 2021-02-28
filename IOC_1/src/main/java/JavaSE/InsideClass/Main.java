package JavaSE.InsideClass;

public class Main {
    public static void main(String[] args) {
        InsideClass i = new InsideClass();
        i.setInfo();
        i.showInfo();

        A a = new A();
        a.testB();
        a.testC();

        new Person();
    }
}
