package TwoSum.practise;
import java.util.Arrays;
public class p1 {
    public static void main(String[] args){
        int target = 9;
        int[] arr = {3, 4, 5, 6};
        System.out.println("Two elements whose sum is equal to target are: " + Arrays.toString(twoSum(target, arr)) );
    }
    public static int[] twoSum(int target, int[] arr){
        int twoSum;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                twoSum = arr[i] + arr[j];
                if(twoSum == target){
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
