package JavaSE.Interface.int3;

public class Main {
    public static void main(String[] args) {
        Dogs corgi = new Dogs();
        Cats regdoll = new Cats();
        corgi.info();
        corgi.eat();
        regdoll.info();
        regdoll.sleep();
        corgi.show();
        regdoll.show();
    }
}
