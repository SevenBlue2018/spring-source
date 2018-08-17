package com.gentlemanqc.spring.event.async;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by GentlemanQcc on 2018/8/13.
 */
@Component
public class DemoListener3{

    /***
     * 对消息进行接受处理
     */
    @EventListener
    @Async
    public void onApplicationEvent(DemoEvent event) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String msg = event.getMsg();
        System.out.println("demoListener3接受到了demoPublisher发布的消息："+msg);
    }
}
