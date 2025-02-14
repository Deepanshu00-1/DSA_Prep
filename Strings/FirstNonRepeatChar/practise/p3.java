import java.util.HashMap;

public class p3 {
    public static void main(String[] args){
        String a = "holoiloa";
        System.out.println(fnr(a));
    }
    static int fnr(String a){
        HashMap<Character, Integer>freq = new HashMap<>();
        for(char c: a.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }
        for(int i=0; i<a.length(); i++){
            if(freq.get(a.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
