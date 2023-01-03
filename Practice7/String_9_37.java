import java.util.Scanner;
public class String_9_37 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String word = in.nextLine();
        String f = " ";
        String f2 = "";
        int half = word.length()/2;
        for(int i = 0; i < word.length()/2; i++){
            f = f + word.charAt(i);
            f2 = f2 + word.charAt(half+i);
        }
        System.out.println(f2+f);;
    }
}

//   import java.util.Scanner;
//   public class String_9_37 {
//      public static void main(String[] args) {
//           Scanner in = new Scanner(System.in);
//           String kesha = in.nextLine();
//           int length = kesha.length();
//
//           String subword = kesha.substring(0, length / 2);
//           String subword2 = kesha.substring(length / 2, length);
//           System.out.println(subword2 + "" + subword);
//       }
//   }