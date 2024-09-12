// SnsPublisher.java
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.model.PublishRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SnsPublisher {

    @Autowired
    private AmazonSNS amazonSNS;

    public void publishMessage(String topicArn, String message) {
        PublishRequest publishRequest = new PublishRequest(topicArn, message);
        amazonSNS.publish(publishRequest);
    }
}

// SqsListener.java
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Service;

@Service
public class SqsListener {

    @SqsListener("queueName")
    public void receiveMessage(String message) {
        System.out.println("Received from SQS: " + message);
    }
}
