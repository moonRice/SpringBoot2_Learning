package JavaEE.ioc.ioc_1;

import JavaEE.ioc.ioc_1.javaconfig.JavaConfig;
import JavaEE.ioc.ioc_1.javaconfig.SayHello;
import JavaEE.ioc.ioc_1.service.UserService;
import JavaEE.ioc.ioc_1.javaconfig.*;
import JavaEE.ioc.ioc_1.service.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class JavaConfigTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        SayHello sayHello = ctx.getBean("sh", SayHello.class);
        System.out.println("sayHello = " + sayHello);
        System.out.println(sayHello.sayHello("小明"));

        UserService userService = ctx.getBean("us", UserService.class);
        List<String> allUsers = userService.getAllUsers();
        System.out.println("allUsers = " + allUsers);
    }
}
