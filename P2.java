public class P2 {
    public static int minusSum(int[] arr){
        int len = arr.length;
        int expectedSum = len * (len + 1) / 2;
        int actualSum = 0;
        for (int i : arr){
            actualSum += i;
        }
        return expectedSum - actualSum;
    }
    public static int hashing(int[] arr){
        int num = 0;
        int size = arr.length;
        boolean[] arr1 = new boolean[size];
        for (int i : arr){
            arr1[i] = true;
        }
        for (int i = 0; i < arr1.length; i++){
            if(arr1[i] == false){
                num = i;
            }
        }
        return num;
    }
    public static void main(String[] args){
        int[] arr = {0, 2, 3, 4, 1};
        int missingNum = minusSum(arr);
        System.out.println("The missing number in the array is: " + missingNum);
        int missingNum1 = hashing(arr);
        System.out.println("The missing number in the array is: " + missingNum1);
    }
}
