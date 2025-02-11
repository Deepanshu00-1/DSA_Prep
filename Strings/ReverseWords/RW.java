package Strings.ReverseWords;

import java.util.Arrays;
import java.util.Collections;

public class RW {
    public static void main(String[] args){
        String s = "hello world";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s){
        // step1: Trim leading and trailing spaces
        s = s.trim();

        // Step2: Reverse the array of words
        String[] words = s.split("\\s+"); //  "\\s" handles multiple spaces

        // step3: Reverse the array of words
        Collections.reverse(Arrays.asList(words));

        // step4: Join words into a single string
        return String.join(" ", words);
    }
}
