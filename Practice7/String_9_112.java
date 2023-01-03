import java.util.Scanner;

public  class String_9_112 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n1= in.nextInt();
        int n2= in.nextInt();
        String word = in.nextLine();
        String krk = word.substring(n1,n2);
        String newWord="";
        if (n1<=n2){
            for (int i =-1;i<word.length();n1++) {
                char f =word.charAt(n1);
                newWord = word.replace(krk,"");
                if (n1>n2) break;
            }
            System.out.println(newWord);
        }
    }
}

// String newWord = word.replace(""+uwEl, "");