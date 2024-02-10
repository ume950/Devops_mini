#include <iostream>
#include <cmath>

using namespace std;

// Function prototypes
double squareRoot(double x);
int factorial(int x);
double naturalLog(double x);
double power(double base, double exponent);

int main() {
    int choice;
    double x, base, exponent;

    do {
        // Display menu
        cout << "Scientific Calculator Menu:" << endl;
        cout << "1. Square Root - √x" << endl;
        cout << "2. Factorial - x!" << endl;
        cout << "3. Natural Logarithm - ln(x)" << endl;
        cout << "4. Power - xb" << endl;
        cout << "5. Exit" << endl;
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                cout << "Enter the value of x: ";
                cin >> x;
                cout << "Square Root of " << x << " = " << squareRoot(x) << endl;
                break;
            case 2:
                cout << "Enter the value of x: ";
                cin >> x;
                cout << "Factorial of " << x << " = " << factorial(x) << endl;
                break;
            case 3:
                cout << "Enter the value of x: ";
                cin >> x;
                cout << "Natural Logarithm of " << x << " = " << naturalLog(x) << endl;
                break;
            case 4:
                cout << "Enter the base: ";
                cin >> base;
                cout << "Enter the exponent: ";
                cin >> exponent;
                cout << base << " raised to the power of " << exponent << " = " << power(base, exponent) << endl;
                break;
            case 5:
                cout << "Exiting the program. Goodbye!" << endl;
                break;
            default:
                cout << "Invalid choice. Please try again." << endl;
        }

    } while (choice != 5);

    return 0;
}

// Function definitions
double squareRoot(double x) {
    return sqrt(x);
}

int factorial(int x) {
    if (x == 0)
        return 1;
    else
        return x * factorial(x - 1);
}

double naturalLog(double x) {
    return log(x);
}

double power(double base, double exponent) {
    return pow(base, exponent);
}

