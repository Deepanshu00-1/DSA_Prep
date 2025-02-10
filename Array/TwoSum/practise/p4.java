package TwoSum.practise;

import java.util.Arrays;

public class p4 {
    public static void main(String[] args){
        int target = 7;
        int nums[] = {3, 4, 5};
        System.out.println("The two numbers whose sum is equal to target are: " + Arrays.toString(twoSum(target, nums)));
    }
    public static int[] twoSum(int target, int[] nums){
        int twoSum;
        for(int i=0; i<nums.length; i++){
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
