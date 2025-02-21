// palindrome is a string which is same as forward and backward.

public class p2 {
    public static void main(String[] args){
        String a = "";
        String b = "abcdcba";
        System.out.println(palindrome(a));
        System.out.println(palindrome(b));
    }
    public static boolean palindrome(String s){
        if(s == null || s.length() == 0){
            return true;
        }
        s = s.toLowerCase();
        for(int i=0; i<=s.length()/2; i++){
            char start = s.charAt(i);
            char end = s.charAt(s.length()-1-i);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
