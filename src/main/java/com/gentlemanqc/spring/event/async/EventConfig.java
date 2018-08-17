package com.gentlemanqc.spring.event.async;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * Created by GentlemanQcc on 2018/8/13.
 */
@Configuration
@ComponentScan({"com.gentlemanqc.spring.event.async"})
@EnableAsync
public class EventConfig implements AsyncConfigurer {

    //实现AsyncConfigurer接口并重写getAsyncExecutor方法，并返回一个ThreadPoolTaskExecutor，这样我们就获得了一个基于线程池TaskExecutor
    //不实现该方法，会报错：springboot无法正常使用异步 @Async 报错：No qualifying bean of type 'org.springframework.core.task.TaskExecutor' available
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(10);
        taskExecutor.setMaxPoolSize(80);
        taskExecutor.setQueueCapacity(100);
        taskExecutor.initialize();
        return taskExecutor;
    }

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher publisher = context.getBean(DemoPublisher.class);
        publisher.published();
        context.close();
//        发部event：com.gentlemanqc.spring.event.async.DemoEvent[source=com.gentlemanqc.spring.event.async.DemoPublisher@4ae9cfc1]
//        发部event：com.gentlemanqc.spring.event.async.DemoEvent[source=com.gentlemanqc.spring.event.async.DemoPublisher@4ae9cfc1]完成
//        demoListener4接受到了demoPublisher发布的消息：发布成功！
//        demoListener3接受到了demoPublisher发布的消息：发布成功！
    }
}