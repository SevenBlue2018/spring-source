package com.gentlemanqc.spring.event.sync;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by GentlemanQcc on 2018/8/13.
 */
@Configuration
@ComponentScan({"com.gentlemanqc.spring.event.sync"})
public class EventConfig {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher publisher = context.getBean(DemoPublisher.class);
        publisher.published();
        context.close();
//        发部event：com.gentlemanqc.spring.event.sync.DemoEvent[source=com.gentlemanqc.spring.event.sync.DemoPublisher@5f0fd5a0]
//        demoListener接收消息：发布成功！
//        demoListener2接收消息：发布成功！
//        发部event：com.gentlemanqc.spring.event.sync.DemoEvent[source=com.gentlemanqc.spring.event.sync.DemoPublisher@5f0fd5a0]完成
    }
}