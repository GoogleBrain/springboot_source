package cn.k.springbeans;

import cn.k.springbeans.config.MyBeanImport;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(MyBeanImport.class)
public class SpringBeansApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringBeansApplication.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for(String str:beanDefinitionNames){
            System.out.println(str);
        }

    }

}
