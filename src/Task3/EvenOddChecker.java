package Task3;

import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input validation
        if (!sc.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
            return;
        }

        int num = sc.nextInt();

        // Method call
        printResult(num);

        sc.close();
    }

    // Clean reusable method
    static void printResult(int num) {
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result);
    }
}