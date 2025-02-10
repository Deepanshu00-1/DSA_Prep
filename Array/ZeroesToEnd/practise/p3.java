public class p3 {
    public static void main(String[] args){
        int arr[] = {0, 0, 0, 1, 2, 3};
        moveZeroes(arr);
        for(int ar : arr){
            System.out.print(ar + " ");
        }
    }
    public static void moveZeroes(int[] arr){
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
