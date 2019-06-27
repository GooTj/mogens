package com.onepiece.mogens.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * 监听者
 * @author Goo Tsung-jen
 * @create 2019-06-19  14:52
 * Innovation distinguishes between a leader and a follower.
 */
@Component
@EnableBinding(StreamClient.class)
@Slf4j
public class StreamReceiver {
    @StreamListener(StreamClient.INPUT)
    //@SendTo(StreamClient.INPUT) //转发至其他通道
    public void process(Object message) {
        log.info("StreamReceiver:{}",message);
    }
}
