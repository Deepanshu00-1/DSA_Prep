package TwoSum;
import java.util.HashMap;
import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
    // Time Complexity: O(N), since we traverse the array once.
    static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), 1};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
