// AccountService.java
public class AccountService {
    public double withdraw(double balance, double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        return balance - amount;
    }
}

// AccountServiceTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountServiceTest {

    @Test
    public void testWithdraw_SufficientBalance() {
        AccountService accountService = new AccountService();
        double newBalance = accountService.withdraw(100.0, 50.0);
        assertEquals(50.0, newBalance);
    }

    @Test
    public void testWithdraw_InsufficientBalance() {
        AccountService accountService = new AccountService();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            accountService.withdraw(100.0, 150.0);
        });
        assertEquals("Insufficient funds", exception.getMessage());
    }
}
