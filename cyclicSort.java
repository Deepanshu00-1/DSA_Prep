public class cyclicSort{

    // Cyclic sort is applicable for ascending order numbers and when numbers are in range [1, N] in array

    public static void main(String[] args){
        int nums[] = {2, 4, 5, 1, 3, 8, 9, 6, 15, 10 ,12, 13, 11, 14, 7};
        CyclicSort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    static void CyclicSort(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
