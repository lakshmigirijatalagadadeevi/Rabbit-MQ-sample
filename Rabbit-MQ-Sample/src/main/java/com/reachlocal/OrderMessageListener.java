package com.reachlocal;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderMessageListener {

    @RabbitListener(queues = "orderQueue")
    public void processOrder(Message data) {
        System.out.print("order data : " + data.toString());
    }

}