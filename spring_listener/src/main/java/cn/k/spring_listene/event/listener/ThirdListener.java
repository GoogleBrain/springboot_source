package cn.k.spring_listene.event.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;

@Order(3)
public class ThirdListener  implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("hello third");
    }
}
