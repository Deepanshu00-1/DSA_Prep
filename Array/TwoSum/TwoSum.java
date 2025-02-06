package TwoSum;
import java.util.Arrays;

public class TwoSum{
    public static void main(String[] args){
        int target = 9;
        int nums[] = {5, 6, 2, 7};
        System.out.println("Two numbers whose sum is equal to target are " + Arrays.toString(TwoSum(target, nums)));
    }
    static int [] TwoSum(int target, int[] nums){
        int twosum;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                twosum = nums[i]+nums[j];
                if(twosum == target){
                    return new int[]{nums[i],nums[j]};
                }
            }
        }
        return new int[]{-1, -1};
    }

}