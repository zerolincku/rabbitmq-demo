package com.linck.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 生产者
 *
 * @author linck
 * @date 2023-02-20
 */
@Component
@Slf4j
public class TestProducer {

    @Resource
    private AmqpTemplate amqpTemplate;

    private Integer num = 1;

    public void production(String routingKey,String msg) {
        amqpTemplate.convertAndSend(routingKey, msg);
    }

    /**
     * 每五秒生产一条消息，并使用直联交换机发送
     */
    @Scheduled(cron = "0/5 * * * * *")
    public void task() {
        log.info("使用直联交换机生产消息{}", num);
        production("rabbitmq-demo.test", "生产消息" + num++);
    }
}
