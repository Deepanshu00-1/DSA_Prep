// Missing Number

// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
// https://leetcode.com/problems/missing-number/
public class Amazon {
    public static void main(String[] args){
        int[] nums = {0, 1, 3};
        System.out.println(MissingNumber(nums));
    }
    static int MissingNumber(int[] nums){
        int i=0;
        
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        // search for first missing number
        for(int index = 0; index<nums.length; index++){
            if(nums[index] != index){
                return index;
            }
        }
        // case 2
        return nums.length;
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
