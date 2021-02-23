package JavaEE.ioc.ioc_1.javaconfig;

import org.springframework.context.annotation.*;
/**
 * Java配置类，等同于ApplicationContext.XML
 *
 * @author zheng*/
@Configuration
@ComponentScan(basePackages="org.ioc.ioc_1.service")
public class JavaConfig {
    @Bean("sh")
    SayHello sayHello(){
        return new SayHello();
    }
}
