import java.util.Scanner;
public class String_9_139{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String text = in.nextLine();
        char f;
        boolean c;
        for (int i =0;i<text.length();i++) {
            f = text.charAt(i);
            c =Character.isDigit(f);
            if (c) {
                System.out.println(f);
            }
        }
    }
}