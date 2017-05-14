package org.qbit.examples.spring.introduction;

import org.qbit.examples.spring.introduction.MessageProvider;
import org.qbit.examples.spring.introduction.MessageRenderer;
import org.qbit.examples.spring.introduction.imp.HelloWorldMessageProvider;
import org.qbit.examples.spring.introduction.imp.StandardOutMessageRenderer;

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
