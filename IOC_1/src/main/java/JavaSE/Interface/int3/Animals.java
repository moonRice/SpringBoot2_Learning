package JavaSE.Interface.int3;

public interface Animals {
    void jump();
    void eat();
    void swim();
    void sleep();
    default void info(){
        System.out.println("小动物");
    };
    default void show(){
        System.out.println("宠物");
    };
}
