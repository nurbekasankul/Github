import java.util.Scanner;
public class String_9_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String word = in.nextLine();
        int san = word.length();
        String subword = word.substring(0,san/2);

        System.out.println(subword);
    }
}
