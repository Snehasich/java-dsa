package sorting;

import java.util.Arrays;

public class Recursive_Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {5,2,10,3,1};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] nums) {
        sort(nums, nums.length);

        return nums;
    }

    static void sort(int[] arr, int n) {
        if(n == 1) {
            return;
        }

        // One pass of Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        sort(arr, n-1);
    }
}
