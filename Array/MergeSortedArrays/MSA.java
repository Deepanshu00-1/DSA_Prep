package MergeSortedArrays;
import java.util.Arrays;

public class MSA {
    public static void main(String[] args){
        int[] nums1 = {1 ,2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
    // Time Complexity: O(m+n), Space Complexity: O(1)
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int i = m-1, j = n-1, k = m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
        while(j>=0){ //if elements remain in nums2
            nums1[k--] = nums2[j--];
        }
    }
}
