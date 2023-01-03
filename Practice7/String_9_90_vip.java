import java.util.Scanner;
public class String_9_90_vip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        String bek = word.replace('e','i');
        String run = bek.replace('E','I');
        System.out.println(run);
    }
}
