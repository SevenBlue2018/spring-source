package com.gentlemanqc.spring.event.extension;

/**
 * Created by GentlemanQcc on 2018/8/14.
 */
public class MessageEventMain {

    public static void main(String[] args){

        MessageEvent messageEvent = new MessageEvent("这是一条报警消息");

        MessageEventPublisher messageEventPublisher =  new MessageEventPublisher();

        MessageEventListener messageEventExtensionListener = new MessageEventExtensionListener();
        MessageEventListener messageEventPrintListener = new MessageEventPrintListener();

        messageEventPublisher.addMessageEventListener(messageEventExtensionListener);
        messageEventPublisher.addMessageEventListener(messageEventPrintListener);

        messageEventPublisher.publishEvent(messageEvent);
    }
}
