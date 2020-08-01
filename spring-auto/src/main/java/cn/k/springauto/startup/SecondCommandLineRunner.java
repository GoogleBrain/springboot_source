package cn.k.springauto.startup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 启动加载器，框架启动完了，立即执行的。
 */
@Component
@Order(3)
public class SecondCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("this is my second runner*********************");
    }
}
