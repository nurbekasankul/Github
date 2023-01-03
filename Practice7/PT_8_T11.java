public class PT_8_T11 {
    public static void main(String[] args) {
        String word = "I love Java and Cpp";
        String arr[] = word.split(" ");
//
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

        System.out.println();
        String arr2[] = word.split("o");
        for(int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }

//        System.out.println();
//        String arr3[] = word.split("Java");
//        for(int i = 0; i < arr3.length; i++){
//            System.out.println(arr3[i]);
//        }
    }
}
