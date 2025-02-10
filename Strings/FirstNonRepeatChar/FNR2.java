package Strings.FirstNonRepeatChar;

import java.util.HashMap;

// understaing working of hashmap & getOrDefault(c, 0) + 1

public class FNR2 {
    public static void main(String[] args){
        HashMap<Character, Integer> freq = new HashMap<>();
        String s = "hello";
        char[] sArr = s.toCharArray();
        for(char c : sArr){
            freq.put(c, freq.getOrDefault(c, 0)+ 1);
        }
        System.out.println(freq); // {h=1, e=1, l=2, o=1}
    }
}
