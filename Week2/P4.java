package Week2;
import java.util.Arrays;
public class P4 {
    public static void bruteForce(int[] arr){
        int closest = Integer.MAX_VALUE;
        int closestI = 0;
        int closestJ = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < i; j++){
                if (Math.abs(arr[i] + arr[j]) < closest){
                    closest = Math.abs(arr[i] + arr[j]);
                    closestI = arr[i];
                    closestJ = arr[j];
                }
            }
        }
        System.out.println(closestI + " + " + closestJ + " = " + closest);
    }

    public static void minSorted(int[] arr) {
        Arrays.sort(arr);
        int closest = Integer.MAX_VALUE;
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        int closestLeftIndex = leftIndex;
        int closestRightIndex = rightIndex;
        while (leftIndex < rightIndex) {
            int sum = arr[leftIndex] + arr[rightIndex];
            if (closest > Math.abs(sum)) {
                closest = Math.abs(sum);
                closestLeftIndex = leftIndex;
                closestRightIndex = rightIndex;
            }
            if (sum == 0) {
                break; // We found the closest pair
            } else if (sum > 0) {
                rightIndex--;
            } else {
                leftIndex++;
            }
        }
        System.out.println(arr[closestLeftIndex] + " + " + arr[closestRightIndex] + " = " + closest);
    }
    public static void main(String[] args){
        int[] arr0 = {2, 3, 9, 6};
        int[] arr1 = {-100, -50, -52, 99};
        bruteForce(arr0);
        bruteForce(arr1);
        minSorted(arr0);
        minSorted(arr1);
    }
}

