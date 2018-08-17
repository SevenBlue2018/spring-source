package com.gentlemanqc.spring.event.jdk;

import org.springframework.context.ApplicationEvent;

/**
 * Created by GentlemanQcc on 2018/8/13.
 */
public class JdkDemoEvent{

    private String msg;

    public void sysLog() {
        System.out.println(msg);
    }

    public JdkDemoEvent(String msg) {
        this.setMsg(msg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
