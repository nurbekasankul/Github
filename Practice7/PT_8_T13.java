public class PT_8_T13 {
    public static void main(String[] args) {
        String word = "Hello my name is Nurbek";
        int length = word.length();
        String subword = word.substring(0,5);
        String subword2 = word.substring(6,17);
        String subword3 = word.substring(17,length);

        System.out.println(subword);
        System.out.println(subword2);
        System.out.println(subword3);
    }
}

