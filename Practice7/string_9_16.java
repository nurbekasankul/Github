import java.util.Scanner;
class String_9_16{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter num brooo :");
        String word=in.nextLine();

        char c0=word.charAt(0);
        char c1=word.charAt(2);

        if (c0==c1) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
//import java.util.Scanner;
//public class string_9_16 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner (System.in);
//        String word = in.nextLine();
//        boolean res = word.equals(word);
//        boolean res1 = word.equals(word);
//
//        System.out.println(res);
//        System.out.println(res1);
//    }
//}
