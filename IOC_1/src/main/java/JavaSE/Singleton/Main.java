package JavaSE.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance(18, "Linda", "China");
        System.out.println("s = " + s);
        Singleton k = Singleton.getInstance(10, "Sam", "England");
        System.out.println("s = " + s);
        System.out.println("k = " + k);
    }
}
