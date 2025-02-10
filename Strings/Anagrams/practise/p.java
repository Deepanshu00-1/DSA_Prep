package Strings.Anagrams.practise;

import java.util.Arrays;

public class p {
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }
    public static void main(String[] args){
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("car", "rat"));
    }
}
