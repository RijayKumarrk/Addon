package Project;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner rk = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = rk.nextInt();
        int[] b = new int[size];
        
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            b[i] = rk.nextInt();
        }
        Arrays.sort(b);
        
        System.out.println("Array in descending order:");
      
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(b[i]);
        }
        
    }
}
