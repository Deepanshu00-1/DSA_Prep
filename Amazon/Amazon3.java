// Find all duplicates in array

public class Amazon3 {
    public static void main(String[] args){

    }
    public List<Integer> findDuplicates(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

        // to find all missing
        List<Integer> ans = new ArrayList<>();
        for(int index=0; index<arr.length; index++){
            if(arr[index] != index+1){
                ans.add(arr[index]);
            }
        }

        return ans;

    }
    static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
