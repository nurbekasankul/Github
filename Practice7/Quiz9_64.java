import java.util.Scanner;
public class Quiz9_64 {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        String word = in.next();
        for (int i =0;i<word.length();i++){
            int count=0;
            int j = i+1;
            if (i==j){
                count+=1;
            }
            System.out.println(count);
        }


    }
}
