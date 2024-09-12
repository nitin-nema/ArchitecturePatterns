// ExternalService.java
public class ExternalService {
    public String getData() {
        return "Real Data";
    }
}

// ExternalServiceTest.java
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ExternalServiceTest {
    @Test
    public void testWithMocking() {
        ExternalService service = mock(ExternalService.class);
        //stubbing
        when(service.getData()).thenReturn("Mocked Data");

        assertEquals("Mocked Data", service.getData());
    }
}
