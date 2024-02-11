import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    
    @Test
    public void testSquareRoot() {
        assertEquals(2.0, Calculator.squareRoot(4.0), 0.001);
        assertEquals(3.0, Calculator.squareRoot(9.0), 0.001);
        assertEquals(4.0, Calculator.squareRoot(16.0), 0.001);
    }
    
    @Test
    public void testFactorial() {
        assertEquals(1, Calculator.factorial(0));
        assertEquals(1, Calculator.factorial(1));
        assertEquals(2, Calculator.factorial(2));
        assertEquals(6, Calculator.factorial(3));
        assertEquals(24, Calculator.factorial(4));
    }
    
    @Test
    public void testNaturalLog() {
        assertEquals(0.0, Calculator.naturalLog(1.0), 0.001);
        assertEquals(0.693, Calculator.naturalLog(2.0), 0.001);
        assertEquals(1.099, Calculator.naturalLog(3.0), 0.001);
    }
    
    @Test
    public void testPower() {
        assertEquals(8.0, Calculator.power(2.0, 3.0), 0.001);
        assertEquals(16.0, Calculator.power(4.0, 2.0), 0.001);
        assertEquals(25.0, Calculator.power(5.0, 2.0), 0.001);
    }
}
