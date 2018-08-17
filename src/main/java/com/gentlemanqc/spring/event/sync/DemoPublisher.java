package com.gentlemanqc.spring.event.sync;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by GentlemanQcc on 2018/8/13.
 */
@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext context;

    public void published() {
        DemoEvent event = new DemoEvent(this, "用户付款出现大量失败");
        System.out.println("发部event："+event);
        context.publishEvent(event);
        System.out.println("发部event："+event + "完成");
    }
}
