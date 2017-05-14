package org.qbit.examples.spring.introduction.imp;

import org.qbit.examples.spring.introduction.MessageProvider;
import org.qbit.examples.spring.introduction.MessageRenderer;

/**
 * Created by Benek on 14.05.2017.
 */
public class HelloWorldDecoupled {

        public static void main(String[] args) {
            MessageRenderer mr = new StandardOutMessageRenderer();
            MessageProvider mp = new HelloWorldMessageProvider();
            mr.setMessageProvider(mp);
            mr.render();
        }
}
