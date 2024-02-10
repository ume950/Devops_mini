import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to my calculator!");
        Calculator calculator = new Calculator();
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(calculator.factorial(n));
    }

    public int factorial(int n) {
        int ans = 1;
        for (int i=1; i<=n; i++) {
            ans = ans * i;
        }
        return ans;
    }
}
