package Task2;

import java.util.Scanner;

public class TemperatureConverter {

    // Convert Fahrenheit to Celsius
    public static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    // Convert Fahrenheit to Kelvin
    public static double toKelvin(double f) {
        return (f - 32) * 5 / 9 + 273.15;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Fahrenheit → Celsius");
            System.out.println("2. Celsius → Fahrenheit");
            System.out.println("3. Fahrenheit → Kelvin");
            System.out.println("4. Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            if (choice == 4) break;

            System.out.print("Enter temperature: ");
            double input = sc.nextDouble();

            // Absolute zero validation
            if (input < -459.67 && choice == 1) {
                System.out.println("Invalid: Below absolute zero");
                continue;
            }

            switch (choice) {
                case 1 -> {
                    double c = toCelsius(input);
                    System.out.printf("Celsius: %.2f\n", c);
                }
                case 2 -> {
                    double f = toFahrenheit(input);
                    System.out.printf("Fahrenheit: %.2f\n", f);
                }
                case 3 -> {
                    double k = toKelvin(input);
                    System.out.printf("Kelvin: %.2f\n", k);
                }
                default -> System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}