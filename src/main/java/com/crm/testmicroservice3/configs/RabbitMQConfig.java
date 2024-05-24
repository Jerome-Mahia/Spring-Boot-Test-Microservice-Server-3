package com.crm.testmicroservice3.configs;

import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.context.annotation.Bean;

public class RabbitMQConfig {
    public static final String QUEUE_NAME = "q.test-queue";
    @Bean
    SimpleMessageListenerContainer container(ConnectionFactory connectionFactory, MessageListenerAdapter listenerAdapter) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();

        container.setConnectionFactory(connectionFactory);
        container.setMessageListener(listenerAdapter);

        container.setQueueNames(QUEUE_NAME);

        return container;
    }

    @Bean
    MessageListenerAdapter listenerAdapter(MessageListener listener) {
        return new MessageListenerAdapter(listener, "onMessageReceived");
    }
}
