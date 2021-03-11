package JavaSE.project01;

public class myFunctions {
    static class foreachFunction{
        public static void showArry(int ... array){
            for(int i : array){
                System.out.println(i);
            }
        }
    }

}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println(name);
        System.out.println(age);
    }
}

class Student extends Person {
    String school;

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    @Override
    public void showInfo() {
        System.out.println(super.name + "同学今年" + super.age + "岁了，目前就读" + this.school + "小学。");
    }
}   