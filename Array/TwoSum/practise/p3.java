package TwoSum.practise;
import java.util.Arrays;
import java.util.HashMap;

public class p3 {
    public static void main(String[] args){
        int nums[] = {1, 3 , 5, 6};
        int target = 8;
        System.out.println("Two numbers whose sum is equal to target are: " + Arrays.toString(twoSum(target, nums)));
    }
    public static int[] twoSum(int target, int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), 1};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}

