package com.gentlemanqc.spring.event.async;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by GentlemanQcc on 2018/8/13.
 */
@Component
public class DemoListener4 implements ApplicationListener<DemoEvent> {

    /***
     * 对消息进行接受处理
     */
    @Async
    @Override
    public void onApplicationEvent(DemoEvent event) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String msg = event.getMsg();
        System.out.println("demoListener4接受到了demoPublisher发布的消息："+msg);
    }
}
