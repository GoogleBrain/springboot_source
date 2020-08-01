package cn.k.springauto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.util.StopWatch;

@SpringBootApplication
public class SpringAutoApplication {

    public static void main(String[] args) throws  Exception{
        ConfigurableApplicationContext run = SpringApplication.run(SpringAutoApplication.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for(String a:beanDefinitionNames){
            System.out.println(a);
        }

        StopWatch my = new StopWatch("aaaa");
        my.start("T1");
        Thread.sleep(3000L);
        my.stop();

        System.out.println(my.prettyPrint());

    }

}
