public class CalculatorTest {

    public static void main(String[] args) {
        testSquareRoot();
        testFactorial();
        testNaturalLog();
        testPower();
    }

    public static void testSquareRoot() {
        // Test squareRoot method
        System.out.println("Testing squareRoot method:");
        System.out.println("Square Root of 4.0 = " + Calculator.squareRoot(4.0));
        System.out.println("Square Root of 9.0 = " + Calculator.squareRoot(9.0));
        System.out.println("Square Root of 16.0 = " + Calculator.squareRoot(16.0));
        System.out.println();
    }

    public static void testFactorial() {
        // Test factorial method
        System.out.println("Testing factorial method:");
        System.out.println("Factorial of 0 = " + Calculator.factorial(0));
        System.out.println("Factorial of 1 = " + Calculator.factorial(1));
        System.out.println("Factorial of 2 = " + Calculator.factorial(2));
        System.out.println("Factorial of 3 = " + Calculator.factorial(3));
        System.out.println("Factorial of 4 = " + Calculator.factorial(4));
        System.out.println();
    }

    public static void testNaturalLog() {
        // Test naturalLog method
        System.out.println("Testing naturalLog method:");
        System.out.println("Natural Logarithm of 1.0 = " + Calculator.naturalLog(1.0));
        System.out.println("Natural Logarithm of 2.0 = " + Calculator.naturalLog(2.0));
        System.out.println("Natural Logarithm of 3.0 = " + Calculator.naturalLog(3.0));
        System.out.println();
    }

    public static void testPower() {
        // Test power method
        System.out.println("Testing power method:");
        System.out.println("2.0 raised to the power of 3.0 = " + Calculator.power(2.0, 3.0));
        System.out.println("4.0 raised to the power of 2.0 = " + Calculator.power(4.0, 2.0));
        System.out.println("5.0 raised to the power of 2.0 = " + Calculator.power(5.0, 2.0));
        System.out.println();
    }
}

