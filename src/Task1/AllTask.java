package Task1;

import java.util.Scanner;

public class AllTask {

	public static void main(String[] args) {
		 System.out.println("Hello World! JDK setup successful.");
		 System.out.println("********************* TASk - 2 *********************");
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Fahrenheit: ");
	        double f = sc.nextDouble();

	        double c = (f - 32) * 5 / 9;

	        System.out.printf("Celsius: %.2f\n", c);
	       
	        System.out.println("********************* TASk - 3 *********************");
	        int num = sc.nextInt();

	        if (num % 2 == 0)
	            System.out.println("Even");
	        else
	            System.out.println("Odd");
	        System.out.println("********************* TASk - 4 *********************");
	        int num1 = sc.nextInt();

	        for (int i = 1; i <= 10; i++) {
	            System.out.println(num1 + " x " + i + " = " + (num1 * i));
	        }
	        sc.close();
	        System.out.println("********************* TASk - 5 *********************");
	        int num2 = 12345;
	        int count = 0;

	        while (num2 != 0) {
	            num2 /= 10;
	            count++;
	        }

	        System.out.println(count);
	        System.out.println("********************* TASk - 6 *********************");
	        int n = 10, a = 0, b = 1;

	        for (int i = 0; i < n; i++) {
	            System.out.print(a + " ");
	            int temp = a + b;
	            a = b;
	            b = temp;
	        }
	        System.out.println();
	        System.out.println("********************* TASk - 7 *********************");
	        int num3 = 29;
	        boolean isPrime = true;

	        if (num3 <= 1) isPrime = false;

	        for (int i = 2; i <= Math.sqrt(num3); i++) {
	            if (num3 % i == 0) {
	                isPrime = false;
	                break;
	            }
	        }

	        System.out.println(isPrime ? "Prime" : "Not Prime");
	        System.out.println("********************* TASk - 8 *********************");
	        int day = 3;

	        switch (day) {
	            case 1 -> System.out.println("Monday");
	            case 2 -> System.out.println("Tuesday");
	            case 3 -> System.out.println("Wednesday");
	            default -> System.out.println("Invalid");
	        }
	        System.out.println("********************* TASk - 9 *********************");
	        int[] arr = {5, 2, 9, 1, 5};
	        int sum1 = 0;

	        for (int n1 : arr) {
	            sum1 += n1;
	        }

	        System.out.println(sum1);
	        System.out.println("********************* TASk - 10 *********************");
	        double r = 7.5;

	        System.out.println(area(r));
	        System.out.println(circumference(r));
	    }

	    static double area(double r) {
	        return Math.PI * r * r;
	    }

	    static double circumference(double r) {
	        return 2 * Math.PI * r;
	    

	}

}
