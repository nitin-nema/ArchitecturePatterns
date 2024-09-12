// Calculator.java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}


// return
// CalculatorTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));  // Expected value is 5
    }
}

// Junit,NUnit, PyTest, Jest

