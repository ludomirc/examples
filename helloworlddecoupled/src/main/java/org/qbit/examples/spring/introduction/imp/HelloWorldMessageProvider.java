package org.qbit.examples.spring.introduction.imp;

import org.qbit.examples.spring.introduction.MessageProvider;

/**
 * Created by Benek on 14.05.2017.
 */
public class HelloWorldMessageProvider implements MessageProvider {

    public String getMessage() {
        return "Hello World!";
    }
}
