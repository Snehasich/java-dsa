package DSA.Arrays;

import java.util.Arrays;

//Selection Sort – Pick the smallest and place it
//Idea:
//Find the minimum element and put it in the correct position.
//How it thinks:
//Find smallest element
//Swap it with the first unsorted position

//📌 Example
//Array: 8 3 5
//Steps:
//Find min = 3 → swap with 8 → 3 8 5
//Find min = 5 → swap → 3 5 8

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5,2,10,3,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));

        // best way to use than that
        for(int i=0; i<arr.length-1; i++) {
            int smallest = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    static void selection(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for(int i=start;i<=end;i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }

        return max;
    }
}
