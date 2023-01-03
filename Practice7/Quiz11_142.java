public class Quiz11_142 {
    public static void main(String[] args) {
        int arr[] = {1534,34,56,45,34,36};
        int max = 0;
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if( max< arr[i]){
                max = arr[i];
                j = i;
            }
        }
        arr[j] = 0-arr[j];
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
// done