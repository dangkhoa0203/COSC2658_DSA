package Week1;

public class P4 {
    public static int sum(int[] arr,int min,int max){
        int sumR = 0;
        int sumL = 0;
        for (int i = 0; i < max; i++){
            sumR += arr[i];
        }
        if (min == 0){
        return sumR;
        } else {
            for (int i = 0; i < min; i++){
                sumL += arr[i];
            }
        }
        return sumR - sumL;
    };
    public static void main(String[] args){
        int[] arr = {6, 2, 9, 8, 5, 4, 3};
        System.out.println(sum(arr, 0, 0));
        System.out.println(sum(arr, 0, 6));
        System.out.println(sum(arr, 6, 6));
        System.out.println(sum(arr, 3, 4));
    }
}
