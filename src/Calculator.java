import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double x, base, exponent;
        
        do {
            // Display menu
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Square Root - √x");
            System.out.println("2. Factorial - x!");
            System.out.println("3. Natural Logarithm - ln(x)");
            System.out.println("4. Power - xb");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the value of x: ");
                    x = scanner.nextDouble();
                    System.out.println("Square Root of " + x + " = " + squareRoot(x));
                    break;
                case 2:
                    System.out.print("Enter the value of x: ");
                    x = scanner.nextDouble();
                    System.out.println("Factorial of " + x + " = " + factorial((int) x));
                    break;
                case 3:
                    System.out.print("Enter the value of x: ");
                    x = scanner.nextDouble();
                    System.out.println("Natural Logarithm of " + x + " = " + naturalLog(x));
                    break;
                case 4:
                    System.out.print("Enter the base: ");
                    base = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    exponent = scanner.nextDouble();
                    System.out.println(base + " raised to the power of " + exponent + " = " + power(base, exponent));
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
        } while (choice != 5);
        
        scanner.close();
    }
    
    // Function definitions
    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }
    
    public static int factorial(int x) {
        if (x == 0)
            return 1;
        else
            return x * factorial(x - 1);
    }
    
    public static double naturalLog(double x) {
        return Math.log(x);
    }
    
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}

