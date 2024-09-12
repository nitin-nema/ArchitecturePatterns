// MessageProducer.java
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend("exchange", "routingKey", message);
    }
}

// MessageConsumer.java
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {
    @RabbitListener(queues = "queueName")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
