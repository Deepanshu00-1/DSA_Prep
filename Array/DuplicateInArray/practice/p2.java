public class p2 {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 3};
        System.out.println(Duplicate(nums));
    }
    public static int Duplicate(int[] nums){
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
