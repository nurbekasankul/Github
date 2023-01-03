public class PT_8_T10 {
    public static void main(String[] args) {
        String word = "I go to sadic and school";
        String newWord = word.replaceAll("sadic", "college");

        System.out.println("Old word : " +word);
        System.out.println("New word : " +newWord);

        System.out.println();
        System.out.println();

        String newWord2 = word.replaceAll("sadic", "college");
        String newWord3 = word.replaceFirst("school", "Univer");
        System.out.println(newWord2);
        System.out.println(newWord3);
    }
}
