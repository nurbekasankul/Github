import java.util.Scanner;
public class Quiz9_115 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String bek = word.replace("o","");
        System.out.println(bek);
        }
    }
// done


























//import java.util.Scanner;
//public class Quiz9_115 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println();
//        System.out.println();
//        char[] arr = new char[n];
//        for (int i=0;i<n;i++)
//        {
//            Scanner inn = new Scanner(System.in);
//
//
//
//            arr[i]  = inn.nextLine();
//        }
//        for (int i=0; i<n; i++)
//        {
//         if ( ( i%2==1 && (arr[i]=='о'  || arr[i]=='О') ) || i%2==0);
//         {
//             arr[i] = 0;
//         }
//        }
//        for(int i=0; i<n; i++)
//          {
//           System.out.print(arr[i]);
//          }
//    }
//
//}
