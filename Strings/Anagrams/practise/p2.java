package Strings.Anagrams.practise;

import java.util.Arrays;

public class p2 {
    public static boolean isAnagram(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        char[] aArr =  a.toCharArray();
        char[] bArr = b.toCharArray();
        Arrays.sort(aArr);
        Arrays.sort(bArr);
        return Arrays.equals(aArr, bArr);
    }
    public static void main(String[] args){
        System.out.println(isAnagram("listen", "silent"));
    }
}