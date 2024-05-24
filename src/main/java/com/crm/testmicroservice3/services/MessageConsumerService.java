package com.crm.testmicroservice3.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MessageConsumerService {
    public static final String QUEUE_NAME = "q.test-queue";

    @RabbitListener(queues = QUEUE_NAME)
    public void consumeMessage(String message) {
        log.info("Received message(s): \n{}", message);
    }
}
