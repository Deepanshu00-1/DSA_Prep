package DuplicateInArray;

/*
Approach: (Floyd's Cycle Detection Algorithm)
1. Treat the array as a linked list.
2. Use slow and fast pointers to detect the cycle.
3. Find the start of the cycle (duplicate element).
*/

public class DIA {
    public static void main(String[] args){
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums){
        int slow = nums[0];
        int fast = nums[0];

        // Detect cycle
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);

        // Find the duplicate number
        slow = nums[0];
        while (slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
