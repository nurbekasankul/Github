import java.util.Scanner;
public  class String_9_109{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int a = in.nextInt();
        char bek = word.charAt(a);
        String newword = word.replace(""+bek,"");
        System.out.println(newword);
    }
}
//import java.util.Scanner;
//public  class String_9_109{
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String word = in.nextLine();
//        char bek = word.charAt(2);
//        String newWord = word.replace(""+bek, "");
//        System.out.println(newWord);
//
//    }
//}