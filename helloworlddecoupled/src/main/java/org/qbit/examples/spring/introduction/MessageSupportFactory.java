package org.qbit.examples.spring.introduction;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by Benek on 14.05.2017.
 */
public class MessageSupportFactory {

    private static MessageSupportFactory instance;
    private Properties props;
    private MessageRenderer renderer;
    private MessageProvider provider;
    private MessageSupportFactory() {
        props = new Properties();
        try {
            props.load(getClass().getResourceAsStream("msf.properties"));
            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");
            renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    static {
        instance = new MessageSupportFactory();
    }
    public static MessageSupportFactory getInstance() {
        return instance;
    }
    public MessageRenderer getMessageRenderer() {
        return renderer;
    }
    public MessageProvider getMessageProvider() {
        return provider;
    }
}

