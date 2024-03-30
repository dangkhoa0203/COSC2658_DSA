package Week2;
import java.util.Arrays;
public class P2 {
    public static void unique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void uniqueSorted(int[] arr){
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++){
            if (arr[i] != arr[i - 1]){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {6, 8, 10, 11, 6, 10};
        unique(arr);
        uniqueSorted(arr);
    }
}
