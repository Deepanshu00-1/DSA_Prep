
/*
Q: Check if a String is a Palindrome
A palindrome is a string that reads the same forward and backward. Ignore case and non-alphanumeric characters.
*/

// Time Complexity: O(N)
// Space Complexity: O(1)

public class p {
    public static void main(String[] args){
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); //true
        System.out.println(isPalindrome("race a car")); // false
    }
    public static boolean isPalindrome(String s){
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Remove special chars & convert to lowercase
        int left = 0, right = s.length()-1;

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
