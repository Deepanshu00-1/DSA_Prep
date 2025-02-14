public class p {
    public static void main(String[] args){
        String a = "A man, a plan, a canal: Panama";
        System.out.println(p(a));
    }
    public static boolean p(String a){
        a = a.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = a.length() - 1;

        while(left < right){
            if(a.charAt(left) != a.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
