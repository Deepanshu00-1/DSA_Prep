public class Amazon2 {
    public static void main(String[] args){
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(DuplicateNo(nums));
    } // find duplicate number
    static int DuplicateNo(int[] nums){
        // cyclic sort
        int i = 0;
        
        while(i<nums.length){
            if(nums[i] != i+1){
                int correct = nums[i]-1;
                if(nums[i] != nums[correct]){
                    swap(nums, i, correct);
                }else return nums[i];
            }else i++;
        }
        return -1;

    }
    static void swap (int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
