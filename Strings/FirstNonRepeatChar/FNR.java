package Strings.FirstNonRepeatChar;

import java.util.HashMap;

/*
Find the first  Non-Repeating Character

Find the first unique character in a string and return its index. If none, return -1.
*/

// Time Complexity: O(N)
// Space Complexity: O(1)

public class FNR {

    public static int firstUniqChar(String s){
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i<s.length(); i++){
            if(freq.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println(firstUniqChar("leetcode")); // 0
        System.out.println(firstUniqChar("loveleetcode")); //2
    }
}
