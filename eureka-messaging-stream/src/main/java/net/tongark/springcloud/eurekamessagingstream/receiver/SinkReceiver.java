package net.tongark.springcloud.eurekamessagingstream.receiver;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import java.util.logging.Logger;

@EnableBinding(Sink.class)
public class SinkReceiver {
    private final Logger logger = Logger.getLogger(String.valueOf(getClass()));

    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        logger.info("Received: " + payload);
    }
}
