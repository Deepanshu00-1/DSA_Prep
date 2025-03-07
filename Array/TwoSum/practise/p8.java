
// TwoSum1 is nested loop approach
// TwoSum2 is two pointer approach 

public class p8 {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 3, 4 ,5};
        int target = 6;
        System.out.println(TwoSum2(nums, target));
    }
    public static int TwoSum1(int[] nums, int target){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int sum = nums[i]+nums[j];
                if(sum == target){
                    count++;
                }
            }
        }
        return count;
    }

    public static int TwoSum2(int[] nums, int target){
        int start = 0, end = nums.length-1;
        int count = 0;
        while(start<end){
            int sum = nums[start] + nums[end];
            if(sum == target) count++;
            start++;
            end--;
        }
        return count;
    }
}
