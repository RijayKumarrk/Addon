package Project;
import java.util.Arrays;
public class target_sum {
	    public static int[] findTwoSum(int[] arr, int target) {
	        Arrays.sort(arr);
	        int left = 0;
	        int right = arr.length - 1;
	        while (left < right) {
	            int sum = arr[left] + arr[right];
	            if (sum == target) {
	                return new int[]{arr[left], arr[right]};
	            } else if (sum < target) {
	                left++;
	            } else {
	                right--;
	            }
	        }
	        return null;  
	        }
	    public static void main(String[] args) {
	        int[] arr = {4, 5, 2, 6, 9, 10};
	        int target = 8;

	        int[] result = findTwoSum(arr, target);
	        if (result != null) {
	            System.out.println("Pair found: " + result[0] + " and " + result[1]);
	        } else {
	            System.out.println("No pair found.");
	        }
	    }
	

}
