package JavaEE.AOP.aop_01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalculatorProxy {
    public static Object getInstance(MyCalculator_IMPL myCalculator) {
        return Proxy.newProxyInstance(
                CalculatorProxy.class.getClassLoader(),
                myCalculator.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     *
                     * @param proxy 代理的对象
                     * @param method 代理的方法
                     * @param args 方法的参数
                     * @return 方法的返回值
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println(method.getName() + "：方法开始执行.");
                        Object invoke = method.invoke(myCalculator, args);
                        System.out.println(method.getName() + "：方法执行完毕.");
                        return invoke;
                    }
                });
    }
}
