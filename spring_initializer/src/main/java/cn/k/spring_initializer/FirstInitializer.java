package cn.k.spring_initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;
@Order(3)
public class FirstInitializer  implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext context) {
        ConfigurableEnvironment environment = context.getEnvironment();

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("key1","value1");
        MapPropertySource firstInitializer = new MapPropertySource("firstInitializer", map);
        environment.getPropertySources().addLast(firstInitializer);
        System.out.println("第一个 spring 初始化器");

    }
}
