package com.onepiece.mogens.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 发送者
 * @author Goo Tsung-jen
 * @create 2019-06-19  11:30
 * Innovation distinguishes between a leader and a follower.
 */
@Component
@Slf4j
public class MqSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        amqpTemplate.convertAndSend("myQueues","我是消息");
    }
}
