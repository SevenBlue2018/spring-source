package com.gentlemanqc.spring.event.extension;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by GentlemanQcc on 2018/8/14.
 */
public class MessageEventPublisher {

    private Set<MessageEventListener> messageEventListeners;

    public MessageEventPublisher(){
        messageEventListeners = new LinkedHashSet<>();
    }

    public void addMessageEventListener(MessageEventListener messageEventListener){
        messageEventListeners.add(messageEventListener);
    }

    public void removeMessageEventListener(MessageEventListener messageEventListener){
        messageEventListeners.remove(messageEventListener);
    }

    public void publishEvent(MessageEvent messageEvent){
        for(MessageEventListener messageEventListener : messageEventListeners){
            messageEventListener.onApplicationEvent(messageEvent);
        }
    }
}
