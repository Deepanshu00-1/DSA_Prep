// fibonacci series - 0,1,1,2,3,5,8,13......
// sum of previous two equals third

public class fibonacci {
    public static void main(String[] args){
        System.out.println(fibo(6));
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
