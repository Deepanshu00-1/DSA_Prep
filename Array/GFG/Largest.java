public class Largest {
    public static void main(String[] args){
        int[] arr = {1, 8, 7, 56, 90};
        int[] arr2 = {10};
        int[] arr3 = {5, 5, 5, 5};
        System.out.println(Largest(arr3));
    }
    static int Largest(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        if(arr.length == 1){
            return arr[0];
        }
        int largest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
