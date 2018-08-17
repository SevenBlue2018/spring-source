package com.gentlemanqc.spring.event.sync;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by GentlemanQcc on 2018/8/13.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    /***
     * 对消息进行接受处理
     */
    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("demoListener接收消息："+msg);
    }
}
