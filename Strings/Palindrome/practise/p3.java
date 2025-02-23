public class p3 {
    public static void main(String[] args){
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String a){
        a = a.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = a.length()-1;
        while(left<right){
            if(a.charAt(left) != a.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
