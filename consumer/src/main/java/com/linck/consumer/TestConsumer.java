package com.linck.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消费者
 *
 * @author linck
 * @date 2023-02-20
 */

@Slf4j
@Component
@RabbitListener(queues = "rabbitmq-demo.test")
public class TestConsumer {

    @RabbitHandler
    public void consume(String msg) throws InterruptedException {
        Thread.sleep(3 * 1000);
        log.info("消费消息: {}", msg);
    }
}
