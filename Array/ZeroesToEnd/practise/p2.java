
// move zeroes to end

public class p2{
    public static void main(String[] args){
        int nums[] = {1 ,0, 2, 0, 3};
        moveZeroes(nums);
        for( int num : nums){
            System.out.print(num + " ");
        }
    }
    public static void moveZeroes(int[] nums){
        int j = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
} 