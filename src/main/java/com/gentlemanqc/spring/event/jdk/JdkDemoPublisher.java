package com.gentlemanqc.spring.event.jdk;

import java.util.Date;
import java.util.Observable;

/**
 * Created by GentlemanQcc on 2018/8/16.
 */
public class JdkDemoPublisher extends Observable{

    private Date publishTime;

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public void publishEvent(JdkDemoEvent jdkDemoEvent){
        setChanged();//因为不同包中protected方法无法被子类继承，所以无法通过创建子类对象的方式来调用父类protected方法
        notifyObservers(jdkDemoEvent);
    }
}
