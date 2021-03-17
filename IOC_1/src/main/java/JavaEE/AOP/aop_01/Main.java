package JavaEE.AOP.aop_01;

public class Main {
    public static void main(String[] args) {
        MyCalculator_IMPL myCalculator_impl = new MyCalculator_IMPL();
        MyCalculator calculator = (MyCalculator) CalculatorProxy.getInstance(myCalculator_impl);
        int add = calculator.add(3, 4);
        System.out.println("add = " + add);
    }
}
