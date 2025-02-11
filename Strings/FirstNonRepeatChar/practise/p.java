package Strings.FirstNonRepeatChar.practise;

public class p {

    String a = "hololoa";
    public static void main(String[] args){
        System.out.print("The first non repeating character in given string is: " + FNR(a));
    }
    public static char(String a){
        HashMap<Character, Integer>freq = new HashMap<>();
        for(char c: a.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for(int i=0; i<a.length(); i++){
            if(freq.get.a.charAt(i) == 1){
                return i;
            }
        }
        return -1;
    }
}
