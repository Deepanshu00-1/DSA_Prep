public class p2 {
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(p(s));
    }
    public static boolean p(String s){
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // replace all non alphabetical character
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
