package com.gentlemanqc.spring.event.extension;

/**
 * Created by GentlemanQcc on 2018/8/14.
 */
public class MessageEventPrintListener implements MessageEventListener{

    @Override
    public void onApplicationEvent(MessageEvent messageEvent){
        System.out.println("处理" + messageEvent);
    }
}
