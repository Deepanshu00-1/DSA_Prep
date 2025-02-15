package NextPermutation;
import java.util.Arrays;

/*
Approach: 
1. Find the first decreasing element from the end.
2. Find the next larger element to swap.
3. Reverse the remaining part.
*/

public class NP {
    public static void main(String[] args){
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void nextPermutation(int[] nums){
        int i = nums.length - 2;

        // Step 1: Find first decreasing element
        while (i>=0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i >= 0){
            int j = nums.length - 1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        // Step 3: Reverse the remaining part
        reverse(nums, i + 1, nums.length - 1);
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start++, end--);
        }
    }
}
