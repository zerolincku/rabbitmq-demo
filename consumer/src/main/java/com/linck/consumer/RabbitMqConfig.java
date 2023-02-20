package com.linck.consumer;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author linck
 * @date 2023-02-20
 */
@Configuration
public class RabbitMqConfig {

    /**
     * 直联交换机测试队列
     */
    @Bean
    public Queue testQueue() {
        return new Queue("rabbitmq-demo.test", true);
    }
}
