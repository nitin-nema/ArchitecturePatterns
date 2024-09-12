// EventProcessor.java
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

@Service
public class EventProcessor {

    @StreamListener(Sink.INPUT)
    public void handleEvent(String message) {
        System.out.println("Received event: " + message);
    }
}
