package Strings.Anagrams;

import java.util.Arrays;

/*
Check if Two Strings are Anagrams

Two strings are anagrams if they contain the same characters but in a different order.
*/

// Time Complexity: O(N log N)
// Space Complexity: O(1)

public class A {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())  // if the length of strings are not equal, they cannot be anagram.
            return false;
        char[] sArr = s.toCharArray();  // convert string into character array, this allows us to sort the characters easily.
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);  // sort both character arrays in ascending order using Arrays.sort().
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);  // if sorted arrays are equal, the words are anagrams.
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("rat", "car")); // false
    }
}
