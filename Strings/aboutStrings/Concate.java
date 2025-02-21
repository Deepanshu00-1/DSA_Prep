import java.util.ArrayList;

public class Concate {
    public static void main(String[] args){
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a'+3)); //a = schi value

        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("rohan" + new ArrayList<>()); //if there is an object java will convert the non string toString
        System.out.println("rohan" + new Integer(56));
    }
}
