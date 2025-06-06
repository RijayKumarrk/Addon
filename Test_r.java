package Project;
import java.util.Scanner;

public class Test_r {
	


	    
	   
	    public static long factorial(int n) {
	        if (n <= 1)
	            return 1;
	        return n * factorial(n - 1);
	    }

	   
	    public static int fibonacci(int n) {
	        if (n <= 1)
	            return n;
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int choice, number;

	        do {
	            System.out.println("\n--- Recursive Operations Menu ---");
	            System.out.println("1. Factorial");
	            System.out.println("2. Fibonacci");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1: 
	                    System.out.print("Enter a number to calculate factorial: ");
	                    number = scanner.nextInt();
	                    if (number < 0) {
	                        System.out.println("Factorial is not defined for negative numbers.");
	                    } else {
	                        System.out.println("Factorial of " + number + " is: " + factorial(number));
	                    }
	                    break;

	                case 2: 
	                    System.out.print("Enter position for Fibonacci sequence: ");
	                    number = scanner.nextInt();
	                    if (number < 0) {
	                        System.out.println("Fibonacci is not defined for negative numbers.");
	                    } else {
	                        System.out.println("Fibonacci number at position " + number + " is: " + fibonacci(number));
	                    }
	                    break;

	                case 3:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice.");
	            }
	        } while (choice != 3);

	      
	    }
	


}
