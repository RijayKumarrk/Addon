package project;
import java.util.Arrays;
public class dupicate {
	    public static void main(String[] args) {
	        int[] nums = {2, 3, 4, 4, 5, 8, 2, 3};
	        Arrays.sort(nums); 
	        int i = 0; 
	        for (int j = 1; j < nums.length; j++) {
	            if (nums[j] != nums[i]) {
	                i++;
	                nums[i] = nums[j];
	            }
	        }
	        System.out.print("Unique elements: ");
	        for (int k = 0; k <= i; k++) {
	            System.out.print(nums[k] + " ");
	        }
	    }
}
