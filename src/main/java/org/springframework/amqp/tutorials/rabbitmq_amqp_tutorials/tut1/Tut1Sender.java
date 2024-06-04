package org.springframework.amqp.tutorials.rabbitmq_amqp_tutorials.tut1;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.amqp.core.Queue;


public class Tut1Sender {

    @Autowired
    private RabbitTemplate template;

    @Autowired
    private Queue queue;

    /**
     * Manda los datos a la cola.
     */
    public void send() {
        String message = "Hello World!";
        this.template.convertAndSend(queue.getName(), message);
        System.out.println(" [x] Sent '" + message + "'");
    }
}
