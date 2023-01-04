import java.util.Scanner;
public  class String_9_151{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        char f ;
        String text = "";
        int l ;
        int max = 0;
        int a[] = new int [word.length()];
        for (int i = 0; i < word.length(); i++) {
            f = word.charAt(i);
            l = Character.digit(f,10);
            if (l >= 0){
                a[i] = l;
                for (int j = 0; j < word.length(); j++) {
                    if (a[j] > max) {
                        max = a[j];
                    }
                }
            }
        }
        System.out.println(max);
    }
}
