import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void factorialPositive() {
        assertEquals("True positive factorial:", 120, calculator.factorial(5));
        assertEquals("True postive factorial: ", 24, calculator.factorial(4));
    }

}
