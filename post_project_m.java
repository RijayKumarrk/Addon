package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class post_project_m {

   
    static ArrayList<String> items = new ArrayList<>();

    public static void main(String[] args) {
        menu();  
    }

    public static void menu() {
        Scanner rk = new Scanner(System.in);

        while (true) {
            System.out.println("\n\t\tMENU");
            System.out.println("1. Add item");
            System.out.println("2. View items");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int n = rk.nextInt();
            rk.nextLine(); 

            if (n == 1) {
                System.out.print("Enter an item: ");
                String item = rk.nextLine();
                items.add(item);
                System.out.println("Item added!");
            } else if (n == 2) {
                System.out.println("Items:");
                for (String i : items) {
                    System.out.println("- " + i);
                }
            } else if (n == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

       
    }
}
