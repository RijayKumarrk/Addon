package Project;
import java.util.Scanner;


public class Test {

	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int size, choice, position, value;

	        System.out.print("Enter the size of the array: ");
	        size = scanner.nextInt();
	        int[] arr = new int[100]; 
	        int n = 0;

	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	            n++;
	        }

	        do {
	            System.out.println("\n--- Array Operations Menu ---");
	            System.out.println("1. Insert");
	            System.out.println("2. Delete");
	            System.out.println("3. Update");
	            System.out.println("4. Display");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1: 
	                    if (n >= arr.length) {
	                        System.out.println("Array is full, cannot insert.");
	                        break;
	                    }
	                    System.out.print("Enter position to insert (0 to " + n + "): ");
	                    position = scanner.nextInt();
	                    if (position < 0 || position > n) {
	                        System.out.println("Invalid position.");
	                        break;
	                    }
	                    System.out.print("Enter value to insert: ");
	                    value = scanner.nextInt();
	                    for (int i = n; i > position; i--) {
	                        arr[i] = arr[i - 1];
	                    }
	                    arr[position] = value;
	                    n++;
	                    System.out.println("Element inserted.");
	                    break;

	                case 2: 
	                    System.out.print("Enter position to delete (0 to " + (n - 1) + "): ");
	                    position = scanner.nextInt();
	                    if (position < 0 || position >= n) {
	                        System.out.println("Invalid position.");
	                        break;
	                    }
	                    for (int i = position; i < n - 1; i++) {
	                        arr[i] = arr[i + 1];
	                    }
	                    n--;
	                    System.out.println("Element deleted.");
	                    break;

	                case 3: 
	                    System.out.print("Enter position to update (0 to " + (n - 1) + "): ");
	                    position = scanner.nextInt();
	                    if (position < 0 || position >= n) {
	                        System.out.println("Invalid position.");
	                        break;
	                    }
	                    System.out.print("Enter new value: ");
	                    value = scanner.nextInt();
	                    arr[position] = value;
	                    System.out.println("Element updated.");
	                    break;

	                case 4: 
	                    System.out.print("Current Array: ");
	                    for (int i = 0; i < n; i++) {
	                        System.out.print(arr[i] + " ");
	                    }
	                    System.out.println();
	                    break;

	                case 5: 
	                    System.out.println("Exiting program.");
	                    break;

	                default:
	                    System.out.println("Invalid choice.");
	            }
	        } while (choice != 5);

	    }
	    
	}



