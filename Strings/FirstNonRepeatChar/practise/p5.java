import java.util.HashMap;

public class p5 {
    public static void main(String[] args){
        System.out.println(FNR("LeettcodeL"));
    }
    public static int FNR(String a){
        HashMap<Character, Integer>freq = new HashMap<>();        
        for(char c : a.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }
        for(int i=0; i<a.length(); i++){
            if(freq.get(a.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
