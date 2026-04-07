package dsa.arrays;

import java.util.Arrays;

//Idea:
//Take one element and insert it into the correct position in the already sorted part.
//How it thinks:
//Left side is always sorted
//Right side is unsorted
//Pick one element and shift elements to insert it
//📌 Example
//Array: 8 3 5
//Steps:
//        8 | 3 5   → take 3, insert before 8 → 3 8 5
//        3 8 | 5   → take 5, insert → 3 5 8

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {5,2,10,3,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));


        // best way to use than that
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;
        }
    }

    static void insertion(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j>0; j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
