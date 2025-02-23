public class p4 {
    public static void main(String[] args){
        System.out.println(isPalindrome("a man, a plan, a canal : Panama "));
    }
    public static boolean isPalindrome(String a){
        a = a.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = a.length()-1;
        while(start < end){
            if(a.charAt(start) != a.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
