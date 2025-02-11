package Strings.Anagrams.practise;

import java.util.Arrays;

// Check if two  strings are Anagram
// Anagram means bots string will have same characters but in different order

public class p3{
    public static void main(String[] args){
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("bar", "bat"));
    }
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }
}
