package org.qbit.examples.spring.introduction.imp;

import org.qbit.examples.spring.introduction.MessageProvider;
import org.qbit.examples.spring.introduction.MessageRenderer;

/**
 * Created by Benek on 14.05.2017.
 */
public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                            + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }

}
