package JavaEE.aware.aware1;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zheng
 */
@Service
@PropertySource(value = "aware.properties")
public class AwareService implements BeanNameAware, BeanFactoryAware, ResourceLoaderAware, EnvironmentAware {
    private String beanName;
    private ResourceLoader resourceLoader;
    private Environment environment;

    public void output() throws IOException {
        System.out.println("beanName = " + beanName);
        Resource resource = resourceLoader.getResource("aware.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream()));
        String s = br.readLine();
        System.out.println("s = " + s);
        br.close();
        String address = environment.getProperty("aware.address");
        System.out.println("address = " + address);
    }

    /**
     * 获取bean的生成工厂
     */
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setBeanName(@NotNull String s) {
        this.beanName = s;
    }

    @Override
    public void setEnvironment(@NotNull Environment environment) {
        this.environment = environment;
    }

    @Override
    public void setResourceLoader(@NotNull ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
}
