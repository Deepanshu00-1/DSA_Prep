public class cyclicSort {
    public static void main(String[] args){
        int[] nums = {5, 3, 4, 0, 1};
        // CyclicSort(nums);
        // for(int num : nums){
        //     System.out.println(num + " ");
        // }
        System.out.println(CyclicSort(nums));
    }
    static int CyclicSort(int[] nums){
        int i = 0; 
        while(i < nums.length){
            int correctIndex = nums[i];
            if(nums[i]<nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else i++;
        }
        for(int index=0; index<nums.length; index++){
            if(nums[index] != index){
                return index;
            }
        }
        return -1;
    }
    static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
