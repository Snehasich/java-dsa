package DSA_PRAC.Medium;

// Problem: Bubble Sort,   use two pointer

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        bubble(arr);
    }

    static void bubble(int[] arr) {
        int start = 0;
        int end = arr.length - 1;


        for(int i=start; i<=end; i++) {
            for(int j=start; j<=end-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
