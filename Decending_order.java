package Project;
import java.util.Arrays;
import java.util.Scanner;
public class Decending_order {
	
	    public static void main(String[] args) {
	        int[] arr = new int[5];
	        Scanner rk = new Scanner(System.in);
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println("Enter value " + (i + 1) + ":");
	            arr[i] = rk.nextInt();
	        }
	        Arrays.sort(arr);
	        
	        System.out.println("Array in descending order:");
	        for (int i = arr.length - 1; i >= 0; i--) {
	            System.out.println(arr[i]);
	        }
	        
	       
	    
	}


}
