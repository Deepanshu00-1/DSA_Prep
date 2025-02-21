public class p6 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Sorted input
        int target = 10;

        int count = countPairs(nums, target);
        System.out.println("Number of pairs: " + count); // Output: 4
    }

    public static int countPairs(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int count = 0;
        while(start < end){
            int sum = nums[start] + nums[end];
            if(sum == target){
                count++;
                start++;
                end--;
            }else if(sum < target){
                start++;
            }else{
                end--;
            }
        } 
        return count;
    }
}
