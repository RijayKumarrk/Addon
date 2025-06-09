package Project;
import java.util.Scanner;
public class palindrome {
	  public static void checkPalindrome(String s) {
	        int left = 0, right = s.length() - 1;
	        while (left < right) {
	            if (s.charAt(left) != s.charAt(right)) {
	                System.out.println(s + ", is not a palindrome.");
	                return;
	            }
	            left++;
	            right--;
	        }
	        System.out.println(s + ", is a palindrome.");
	    }

	    public static void main(String[] args) {
	        Scanner rijay = new Scanner(System.in);     
	              System.out.print("Enter a string to check if it's a palindrome: ");
	        String rk = rijay.nextLine();
	            checkPalindrome(rk);
	    }
	}


