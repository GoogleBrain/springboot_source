package cn.k.springauto.service.config;

import cn.k.springauto.service.HeService;
import cn.k.springauto.service.MyService;
import cn.k.springauto.service.SheService;
import cn.k.springauto.service.conditional.MyConditional;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {MyService.class, SheService.class})
public class BeanConfig {

    @Conditional(MyConditional.class)
    @Bean
    public HeService getHeService(){
        return new HeService();
    }
}
