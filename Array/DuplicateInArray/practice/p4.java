public class p4 {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 2, 4};
        System.out.println(duplicate(nums));
    }
    public static int duplicate(int[] nums){
        int slow = nums[0];
        int fast = nums[0];
        // detect cycle
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);
        // find duplicate
        slow = nums[0];
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
