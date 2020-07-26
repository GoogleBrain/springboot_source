package cn.k.spring_listener;

import cn.k.spring_listene.event.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringListenerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringListenerApplication.class, args);

        WeatherEventMul eventMul = new WeatherEventMul();

        RainListener rainListener = new RainListener();
        SnowListener snowListener = new SnowListener();

        eventMul.addListerer(rainListener);
        eventMul.addListerer(snowListener);

        eventMul.mulcaseEvent(new SnowEvent());
        eventMul.mulcaseEvent(new RainEvent());
        eventMul.delListener(rainListener);
        eventMul.mulcaseEvent(new SnowEvent());
        eventMul.mulcaseEvent(new RainEvent());

    }

}
