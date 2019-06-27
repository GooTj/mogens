package com.onepiece.mogens.message;

import com.esotericsoftware.minlog.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * 发送端
 * @author Goo Tsung-jen
 * @create 2019-06-19  14:56
 * Innovation distinguishes between a leader and a follower.
 */
@Component
@EnableBinding(StreamClient.class)
public class StreamSender {
//    //    @Autowired
////    private StreamClient streamClient;
////
////    public void process() {
////        streamClient.output().send(MessageBuilder.withPayload("我是消息").build());
////    }
//
//    @StreamListener(StreamClient.INPUT)
//    public void processOutput(Object message) {
//        Log.info("StreamReceiver:{},message");
//
//    }
}
