package JavaEE.ioc.ioc_1;

import JavaEE.ioc.ioc_1.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * git test
 * @author zheng
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        // **
    }

    private static void m3(ClassPathXmlApplicationContext ctx) {
        User u4 = ctx.getBean("user4", User.class);
        System.out.println("u4 = " + u4);
    }

    private static void mAll(ClassPathXmlApplicationContext ctx) {
        m1(ctx);
        m2(ctx);
        m3(ctx);
    }

    public static void m1(ClassPathXmlApplicationContext ctx) {
        User u1 = (User) ctx.getBean("user");
        User u2 = ctx.getBean("user2", User.class);

        // user 和 user2都存在时，以下代码报错
//        User u3 = ctx.getBean(User.class);

        System.out.println("u1 = " + u1);
        System.out.println("u2 = " + u2);
    }

    public static void m2(ClassPathXmlApplicationContext ctx) {
        User u3 = ctx.getBean("user3", User.class);
        System.out.println("u3 = " + u3);
    }
}
