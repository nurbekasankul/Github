import java.util.Scanner;
public class String_9_42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        char nur = 'b';
        for ( int i = word.length()-1; i>=0; i-- ) {
            nur = word .charAt(i);
            System.out.print(nur);
        }
    }
}
