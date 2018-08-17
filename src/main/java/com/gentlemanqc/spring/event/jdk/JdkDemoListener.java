package com.gentlemanqc.spring.event.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by GentlemanQcc on 2018/8/16.
 */
public class JdkDemoListener implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        JdkDemoEvent jdkDemoEvent = (JdkDemoEvent)arg;
        JdkDemoPublisher jdkDemoPublisher = (JdkDemoPublisher)o;
        System.out.println("观察者获取到消息：" + jdkDemoEvent.getMsg() + "，发布时间为" + jdkDemoPublisher.getPublishTime());
    }
}
