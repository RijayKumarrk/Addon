package Project;

import java.util.Scanner;

public class post_project_s{
    public static int sumofdigits(int n) {
        if (n == 0)
            return 0;

        return (n % 10) + sumofdigits(n / 10);
    }

    public static void main(String[] args) {
   Scanner rk = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = rk.nextInt();
        
        System.out.println("Sum of digits: " + sumofdigits(number));
    }
}
