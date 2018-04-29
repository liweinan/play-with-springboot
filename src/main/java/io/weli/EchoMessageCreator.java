package io.weli;

import org.springframework.stereotype.Component;

@Component
public class EchoMessageCreator {

    public EchoMessage createEchoMessage(String echoText) {
        return new EchoMessage(echoText);
    }

}

