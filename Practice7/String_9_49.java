import java.util.Scanner;
public class String_9_49 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String word = in.next();
        for ( int i = 0; i<word.length(); i++) {
            System.out.print("*");
        }
        System.out.print(word);
        for ( int i = 0; i<word.length(); i++) {
            System.out.print("*");
        }
    }
}
