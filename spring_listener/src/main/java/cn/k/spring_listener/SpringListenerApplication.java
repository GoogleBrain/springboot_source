package cn.k.spring_listener;

import cn.k.spring_listene.event.*;
import cn.k.spring_listene.event.listener.SecondListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringListenerApplication {

    public static void main(String[] args) {

        /**
         * 模拟监听器模式实现一个样例
         */
//        SpringApplication.run(SpringListenerApplication.class, args);
//        WeatherEventMul eventMul = new WeatherEventMul();
//
//        RainListener rainListener = new RainListener();
//        SnowListener snowListener = new SnowListener();
//
//        eventMul.addListerer(rainListener);
//        eventMul.addListerer(snowListener);
//
//        eventMul.mulcaseEvent(new SnowEvent());
//        eventMul.mulcaseEvent(new RainEvent());
//        eventMul.delListener(rainListener);
//        eventMul.mulcaseEvent(new SnowEvent());
//        eventMul.mulcaseEvent(new RainEvent());

        //第二种方式添加监听器
//        SpringApplication springApplication = new SpringApplication(SpringListenerApplication.class);
//        springApplication.addListeners(new SecondListener());
//        springApplication.run();

        //第三种实现方式自定义监听器在properties中实现
        SpringApplication.run(SpringListenerApplication.class, args);
    }

}
