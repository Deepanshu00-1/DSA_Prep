import java.util.Arrays;
import java.util.Collections;

public class p1 {
    public static void main(String[] args){
        String a = "hello how are you";
        a = a.trim();
        String[] words = a.split("\\s+");
        Collections.reverse(Arrays.asList(words));
        // System.out.println(Arrays.toString(words));
        System.out.println(String.join(" " + words));
    }
}
