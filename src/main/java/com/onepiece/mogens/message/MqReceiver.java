package com.onepiece.mogens.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 监听者
 * @author Goo Tsung-jen
 * @create 2019-06-19  11:28
 * Innovation distinguishes between a leader and a follower.
 */
@Slf4j
@Component
public class MqReceiver {
    //@RabbitListener(queues = "myQueues")//监听队列
    //@RabbitListener(queuesToDeclare = @Queue("myQueues"))//自动创建队列
    @RabbitListener(bindings = @QueueBinding(value = @Queue("myQueues"), exchange = @Exchange("myExchange")))//自动创建，exchange和queue绑定
    public void process(String message) {
        log.info("接收到的消息是：{}" ,message);
    }
}
