package cbbatte.springboot.study;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {

    @EventListener
    @Async
    public void handle(MyEvent myEvent) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("received. data : " + myEvent.getData());
    }

    @EventListener
    @Async
    public void handle(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("received. data : " + contextRefreshedEvent.toString());
    }

    @EventListener
    @Async
    public void handle(ContextClosedEvent contextClosedEvent) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("received. data : " + contextClosedEvent.toString());
    }
}
