package medium;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 3, 1};
        // 2 5 4 3 1
        // 2 4 5 3 1
        // 2 3 4 5 1
        // 1 2 3 4 5

        insertion(arr);
    }

    static void insertion(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j>0; j--) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    System.out.println(Arrays.toString(arr));
                    break;
                }
            }
        }


        System.out.println(Arrays.toString(arr));
    }
}