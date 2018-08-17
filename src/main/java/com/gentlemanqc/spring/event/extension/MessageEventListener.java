package com.gentlemanqc.spring.event.extension;

/**
 * Created by GentlemanQcc on 2018/8/14.
 */
public interface MessageEventListener {

    void onApplicationEvent(MessageEvent messageEvent);
}
