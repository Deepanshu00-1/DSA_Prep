package TwoSum.practise;

import java.util.Arrays;
import java.util.HashMap;

public class p2 {
    public static void main(String[] args) {
        int target = 9;
        int[] arr = { 3, 4, 5, 6 };
        System.out.println("Two elements whose sum is equal to target are: " + Arrays.toString(twoSum(target, arr)));
    }
    public static int[] twoSum(int target, int[] nums){
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
