package cbbatte.springboot.study;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AnotherHandler {
    @EventListener // 순차적으로 수행 , 같은 스레드에서
    @Async
    public void handler(MyEvent myEvent) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("another handler : " + myEvent.getData());
    }
}
