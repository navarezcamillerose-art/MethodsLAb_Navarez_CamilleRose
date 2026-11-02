/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodlab6;

import java.util.Scanner;

/**
 *
 * @author THIS
 */
public class MethodLab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TASK 1: GREET USER
        System.out.println("TASK 1: GREET USER");
        greetUser();

        // TASK 2: ARITHMETIC OPERATIONS
        System.out.println("\nTASK 2: ARITHMETIC OPERATIONS");

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));

        if (num2 != 0) {
            System.out.println("Division: " + divide(num1, num2));
        } else {
            System.out.println("Cannot divide by zero.");
        }

        // TASK 3: FACTORIAL
        System.out.println("\nTASK 3: FACTORIAL");

        System.out.print("Enter a number: ");
        int factorialNum = input.nextInt();

        if (factorialNum >= 0 && factorialNum <= 20) {
            System.out.println("Factorial: " + factorial(factorialNum));
        } else {
            System.out.println("Invalid input. Enter 0 to 20.");
        }

        // TASK 4: SUM ARRAY
        System.out.println("\nTASK 4: SUM ARRAY");

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Sum: " + sumArray(numbers));

        // TASK 5: PRIME NUMBER
        System.out.println("\nTASK 5: PRIME NUMBER");

        System.out.print("Enter a number: ");
        int primeNum = input.nextInt();

        if (isPrime(primeNum)) {
            System.out.println(primeNum + " is a prime number.");
        } else {
            System.out.println(primeNum + " is not a prime number.");
        }

        // TASK 6: MAXIMUM VALUE IN ARRAY
        System.out.println("\nTASK 6: MAXIMUM VALUE IN ARRAY");

        System.out.println("Maximum value: " + maxInArray(numbers));

        // TASK 7: GCD AND LCM
        System.out.println("\nTASK 7: GCD AND LCM");

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        if (a > 0 && b > 0) {
            System.out.println("GCD: " + gcd(a, b));
            System.out.println("LCM: " + lcm(a, b));
        } else {
            System.out.println("Please enter positive numbers.");
        }

        // CHALLENGE 1: RECURSIVE FACTORIAL
        System.out.println("\nCHALLENGE 1: RECURSIVE FACTORIAL");

        System.out.print("Enter a number (0-20): ");
        int recursiveNum = input.nextInt();

        if (recursiveNum >= 0 && recursiveNum <= 20) {
            System.out.println("Recursive Factorial: "
                    + recursiveFactorial(recursiveNum));
        } else {
            System.out.println("Invalid input.");
        }

        // CHALLENGE 2: RECURSIVE FIBONACCI
        System.out.println("\nCHALLENGE 2: RECURSIVE FIBONACCI");

        System.out.print("Enter Fibonacci position (0-40): ");
        int fibNum = input.nextInt();

        if (fibNum >= 0 && fibNum <= 40) {
            System.out.println("Fibonacci: " + fibonacci(fibNum));
        } else {
            System.out.println("Invalid input.");
        }

        // CHALLENGE 3: PALINDROME CHECKER
        System.out.println("\nCHALLENGE 3: PALINDROME CHECKER");

        input.nextLine();

        System.out.print("Enter a word or phrase: ");
        String word = input.nextLine();

        if (isPalindrome(word)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

        input.close();
    }

    // =====================================
    // METHOD DECLARATIONS / SOLUTIONS
    // =====================================
    // TASK 1: GREET USER
    static void greetUser() {
        System.out.println("Hello Sawadee, Welcome to Lab6");

    }

    // TASK 2: ARITHMETIC OPERATIONS
    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    // TASK 3: FACTORIAL
    static long factorial(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    // TASK 4: SUM OF ARRAY
    static int sumArray(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    // TASK 5: PRIME NUMBER
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // TASK 6: MAXIMUM VALUE IN ARRAY
    static int maxInArray(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    // TASK 7: GCD
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // TASK 7: LCM
    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    // CHALLENGE 1: RECURSIVE FACTORIAL
    static long recursiveFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * recursiveFactorial(n - 1);
    }

    // CHALLENGE 2: RECURSIVE FIBONACCI
    static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // CHALLENGE 3: PALINDROME CHECKER
    static boolean isPalindrome(String word) {
        String cleanWord = word.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        int left = 0;
        int right = cleanWord.length() - 1;

        while (left < right) {
            if (cleanWord.charAt(left) != cleanWord.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

}
