package TwoSum.practise;

import java.util.Arrays;
// import java.util.Scanner;

public class p5 {
    public static void main(String[] args){
        // Scanner in = new Scanner(System.in);
        int target = 6;
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target){
        int twoSum;
        for (int i = 0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                twoSum = nums[i]+nums[j];
                if(twoSum == target){
                    return new int[]{nums[i], nums[j]};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
