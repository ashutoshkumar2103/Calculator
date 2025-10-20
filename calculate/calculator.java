import java.util.Scanner;
public class calculator {

    // addition
    public static double add(double a, double b) {
        return a + b;
    }

    // subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // division
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Calculator");

        while (true) {
            //display menu
            System.out.println("1. Addition | 2. Subtraction | 3. Multiplication | 4. Division | 5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            if (choice >=1 && choice <=4) {
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                double result = 0;
                String operation = "";

                switch (choice) {
                    case 1:
                        result = add(num1, num2);
                        operation = "+";
                        break;
                    case 2:
                        result = subtract(num1, num2);
                        operation = "-";
                        break;

                    case 3:
                        result = multiply(num1, num2);
                        operation = "*";
                        break;

                    case 4:
                        result = divide(num1, num2);
                        operation = "/";
                        break;
                }

                System.out.println("Result: " + result);
                
            }
            else {
                System.out.println("Invalid choice. Please try again.");
        }
    }
        
    sc.close();

    }

}