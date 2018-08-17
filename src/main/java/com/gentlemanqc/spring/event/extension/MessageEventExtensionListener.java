package com.gentlemanqc.spring.event.extension;

/**
 * Created by GentlemanQcc on 2018/8/14.
 */
public class MessageEventExtensionListener implements MessageEventListener{

    @Override
    public void onApplicationEvent(MessageEvent messageEvent){
        System.out.println("扩展一下："+messageEvent);
    }
}
