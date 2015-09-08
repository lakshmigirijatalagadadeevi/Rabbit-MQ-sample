package com.reachlocal;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderStatusMessageListener {

    @RabbitListener(queues = "orderStatusQueue")
    public void processOrder(Message data) {
        System.out.print("Order Status data: " + data);
    }

}