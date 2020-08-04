package cn.k.springproperties.command;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MyCommand implements CommandLineRunner, EnvironmentAware {

    private Environment env;

    @Override
    public void run(String... args) throws Exception {
           System.out.println("获取属性》》》》》》"+env.getProperty("name"));
    }

    @Override
    public void setEnvironment(Environment environment) {
        env = environment;
    }
}
