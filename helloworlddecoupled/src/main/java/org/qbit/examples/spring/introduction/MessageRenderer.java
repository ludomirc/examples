package org.qbit.examples.spring.introduction;

/**
 * Created by Benek on 14.05.2017.
 */
public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
