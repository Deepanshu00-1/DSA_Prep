package SortAnArraybyDNFA;
import java.util.Arrays;

public class main {
    public static void main(String[] args){
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    // Time Complexity: O(N), Space Complexity: O(1)
    public static void sortColors(int[] nums){
        int low=0, mid=0, high = nums.length-1;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, low++, mid++);
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums, mid, high--);
            }
        }
    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
