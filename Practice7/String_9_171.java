import java.util.Scanner;
public class String_9_171 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String[] nur = word.split(" ");
        int min = nur[0].length();
        for (int i = 0; i < nur.length; i++) {
            min = nur[i].length() < min ? nur[i].length() : min;
        }
        System.out.println(min);
    }
}