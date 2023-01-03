public class PT_8_T3 {
    public static void main(String[] args) {
        String word = "Hello";
        String word2 = "hello";
        String word3 = "Hello";
        boolean res = word.equals(word2);
        boolean res2 = word.equals(word3);

        boolean res3 = word.equalsIgnoreCase(word3);

        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
    }
}
