package com.onepiece.mogens.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author Goo Tsung-jen
 * @create 2019-06-19  14:05
 * Innovation distinguishes between a leader and a follower.
 */
public interface StreamClient {
    String INPUT = "input";



    @Input(StreamClient.INPUT)
    SubscribableChannel input();


}
