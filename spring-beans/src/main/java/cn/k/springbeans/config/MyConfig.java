package cn.k.springbeans.config;

import cn.k.springbeans.domain.StudentBeans;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    /**
     * 第二种方式，注入
     * @return
     */
    @Bean
    public StudentBeans studentBeans(){
        return new StudentBeans();
    }
}
