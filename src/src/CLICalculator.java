package src;

// Problem: Interactive CLI Calculator
// Concepts: Scanner, while-loops, switch expressions, modular methods
// Time Complexity: O(1) per operation
// Space Complexity: O(1)

import java.util.Scanner;

public class CLICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("=== Java CLI Calculator ===");

        while (keepRunning) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                keepRunning = false;
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please select 1-5.");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1 -> System.out.println("Result: " + add(num1, num2));
                case 2 -> System.out.println("Result: " + subtract(num1, num2));
                case 3 -> System.out.println("Result: " + multiply(num1, num2));
                case 4 -> {
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + divide(num1, num2));
                    }
                }
            }
        }
        scanner.close();
    }

    // Modular methods for arithmetic operations
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) { return a / b; }
}
