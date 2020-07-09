package cn.k.spring_initializer;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringInitializerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringInitializerApplication.class, args);

        /**
         * 第二种加载初始化器的方式
         */
//        SpringApplication springApplication = new SpringApplication(SpringInitializerApplication.class);
//        springApplication.addInitializers(new SecondInitializer());
//        springApplication.run(args);
    }
    

}
