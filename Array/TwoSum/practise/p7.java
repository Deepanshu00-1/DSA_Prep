import java.util.Arrays;

public class p7 {
    public static void main(String[] args){
        int[] nums = {1, 4, 2, 3, 5, 0};
        int target = 5;
        System.out.println(Arrays.toString(nestedLoop(target, nums)));
    }
    public static int[] nestedLoop(int target, int[] nums){
        for(int i=0; i<nums.lenght; i++){
            for(int j=i+1; j<nums.length; j++){
                int sum = nums[i]+nums[j];
                if(sum == target){
                    return new int[]{nums[i], nums[j]};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
