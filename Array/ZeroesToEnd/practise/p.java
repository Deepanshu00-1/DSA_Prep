package ZeroesToEnd.practise;

public class p {
    public static void main(String[] args){
        int nums[] = {2, 3, 4, 0, 0, 1, 2};
        moveZeroes(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
    public static void moveZeroes(int nums[]){
        int j = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
