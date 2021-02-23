package JavaEE.ioc.ioc_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author zheng
 */
@Configuration
public class JavaConfig {
    @Bean("cmd")
    @Conditional(WindowsCondition.class)
    ShowCmd winCmd() {
        return new WindowsShowCmd();
    }

    @Bean("cmd")
    @Conditional(LinuxCondition.class)
    ShowCmd linuxCmd() {
        return new LinuxShowCmd();
    }

    @Bean
    @Profile("dev")
    DataSource devDataSource(){
        DataSource ds = new DataSource();
        ds.setUrl("jdbc:mysql:///vhr");
        ds.setUsername("root");
        ds.setPassword("123");
        return ds;
    }
    @Bean
    @Profile("prod")
    DataSource prodDataSource(){
        DataSource ds = new DataSource();
        ds.setUrl("jdbc:mysql://127.0.0.1:3306/vhr");
        ds.setUsername("root");
        ds.setPassword("adFA^#$345rgsESAD8532");
        return ds;
    }
}
