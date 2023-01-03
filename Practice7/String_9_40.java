import java.util.Scanner;

public class String_9_40{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String word = in.next();
        int length = word.length();
        int k = in.nextInt();
        String word2= "";
        String word1 = "";
        for (int i =0;i<k;i++){
            String nur = word.substring(0,i+1);
            word2=nur;
            String bek= word.substring(k,length);
            word1=bek;
        }
        System.out.println(word1+word2);
    }
}
//import java.util.Scanner;
//public class String_9_40 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String word = in.next();
//        int length = word.length();
//        int k = in.nextInt();
//        String newWord = word.substring(0, k);
//        String word2 = word.substring(k, length);
//        System.out.println(word2 + newWord);
//    }
//}