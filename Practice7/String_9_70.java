import java.util.Scanner;
public class String_9_70 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String word = in.nextLine();
        int count = 0;
        int length = word.length();
        for (int i = 0; i < length; i++ ){
            if (word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i)=='u' || word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='y'){
                count++;
            }
        }
        System.out.println(count);
    }
}
