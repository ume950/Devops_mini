import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator Calculator = new Calculator();

    @Test
    public void factorialTruePositive() {
        assertEquals("Finding factorial of a number for True Positive", 6, Calculator.factorial(3), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 720, Calculator.factorial(6), DELTA);
    }

    @Test
    public void factorialTrueNegative() {
        assertNotEquals("Finding factorial of a number for True Negative", 69, Calculator.factorial(5), DELTA);
        assertNotEquals("Finding factorial of a number for True Negative", 42, Calculator.factorial(10), DELTA);
    }

    @Test
    public void powerTruePositive() {
        assertEquals("Finding power for True Positive", 32, Calculator.power(2, 5), DELTA);
        assertEquals("Finding power for True Positive", 81, Calculator.power(9, 2), DELTA);
    }

    @Test
    public void powerTrueNegative() {
        assertNotEquals("Finding power for True Negative", 69, Calculator.power(2, 2), DELTA);
        assertNotEquals("Finding power for True Negative", -69420, Calculator.power(-2, 20), DELTA);
    }

    @Test
    public void logTruePositive() {
        assertEquals("Finding natural log for True Positive", 0, Calculator.naturalLog(1), DELTA);
        assertEquals("Finding natural log for True Positive", 5.703782474656201, Calculator.naturalLog(300), DELTA);
    }

    @Test
    public void logTrueNegative() {
        assertNotEquals("Finding natural log for True Negative", 69, Calculator.naturalLog(2.4), DELTA);
        assertNotEquals("Finding natural log for True Negative", 420, Calculator.naturalLog(2.1), DELTA);
    }

    @Test
    public void sqrootTruePositive() {
        assertEquals("Finding square root for True Positive", 11, Calculator.squareRoot(121), DELTA);
        assertEquals("Finding square root for True Positive", 121, Calculator.squareRoot(14641), DELTA);
    }

    @Test
    public void sqrootTrueNegative() {
        assertNotEquals("Finding square root for True Negative", 69, Calculator.squareRoot(3), DELTA);
        assertNotEquals("Finding square root for True Negative", -42, Calculator.squareRoot(4), DELTA);
    }


}
