import java.util.Scanner;

public class SimpleCalculator {

    // Addition logic
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction logic
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication logic
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division logic
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }

    // Validate input range for double
    public static boolean isValidDouble(double value) {
        return !(Double.isInfinite(value) || Double.isNaN(value)
                 || value > Double.MAX_VALUE || value < -Double.MAX_VALUE);
    }

    public static void delay()  {
         try {
            Thread.sleep(250); 
        } catch (InterruptedException e) {
                System.out.println("Unexpected interruption!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\n--- Simple Calculator ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("What's in your mind today? (1 - 5): ");

            int choice;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Not a valid choice!");
                scanner.nextLine(); 
                delay();
                continue;
            }

            if (choice == 5) {
                keepRunning = false;
                System.out.println("Have a nice day!");
                break;
            }

            // Validate choice BEFORE asking for numbers
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid option! Please select between 1 and 5.");
                delay();
                continue;
            }

            double num1, num2;
            try {
                System.out.print("Enter a value: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter another value: ");
                num2 = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Not a valid number! Try again.");
                scanner.nextLine(); 
                delay();
                continue;
            }

            // Validate range
            if (!isValidDouble(num1) || !isValidDouble(num2)) {
                System.out.println("Error: Number exceeds allowable range for double.");
                delay();
                continue;
            }

            double result = 0;

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;
            }

            System.out.println("Result: " + result);
            delay();
        }
        scanner.close();
    }
}
