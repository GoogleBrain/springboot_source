package cn.k.springauto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAutoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringAutoApplication.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for(String a:beanDefinitionNames){
            System.out.println(a);
        }

    }

}
