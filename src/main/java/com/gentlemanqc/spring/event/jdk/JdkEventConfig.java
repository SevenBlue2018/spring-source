package com.gentlemanqc.spring.event.jdk;

import java.util.Observer;

import java.util.Date;

/**
 * Created by GentlemanQcc on 2018/8/13.
 */
public class JdkEventConfig {

    public static void main(String[] args) throws Exception {

        JdkDemoPublisher jdkDemoPublisher = new JdkDemoPublisher();
        jdkDemoPublisher.setPublishTime(new Date());

        Observer jdkDemoListener = new JdkDemoListener();
        jdkDemoPublisher.addObserver(jdkDemoListener);

        JdkDemoEvent jdkDemoEvent = new JdkDemoEvent("这是一条测试消息");

        jdkDemoPublisher.publishEvent(jdkDemoEvent);
    }
}