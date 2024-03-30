package Week1;

public class P1 {
    public static int largestNum(int[] arr){
        int max = arr[0];
        int j = 0;
        if (arr.length == 0 || arr == null){
            return -1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                    j = i;
                }
            }
        }
        return j;
    }

    public static int secondLargestNum(int[] arr){
        int maxIndex = largestNum(arr);
        arr[maxIndex] = -1;
        maxIndex = largestNum(arr);
        return maxIndex;
    }
    public static void main(String[] args ){
        int[] arr = {7, 6, 9, 3 ,2 ,5, 11};
        int maxIndex = largestNum(arr);
        System.out.println("The maximum value in the array is: " + arr[maxIndex]);
        int secMaxIndex = secondLargestNum(arr);
        System.out.println("The second maximum value in the array is: " + arr[secMaxIndex]);
    }
}