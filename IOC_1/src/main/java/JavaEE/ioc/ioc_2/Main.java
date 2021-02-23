package JavaEE.ioc.ioc_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zheng
 */
public class Main {
    public static void main(String[] args) {
//        m1();
        // 切换环境就不用在这儿填写JavaConfig.class
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        // 生产环境和开发环境的切换
        ctx.getEnvironment().setActiveProfiles("prod");
        ctx.register(JavaConfig.class);
        ctx.refresh();
        DataSource ds = ctx.getBean(DataSource.class);
        System.out.println("ds = " + ds);
    }

    private static void m1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        ShowCmd cmd = (ShowCmd) ctx.getBean("cmd");
        String s = cmd.showCmd();
        System.out.println("s = " + s);
    }
}
