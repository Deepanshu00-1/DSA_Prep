package ZeroesToEnd;

public class ZTE {
    public static void main(String[] args){
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
    // Time complexity: O(N)
    static void moveZeroes(int[] nums){
        int j = 0; // position to place non-zero elements
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                // swap non zero element to position j
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
