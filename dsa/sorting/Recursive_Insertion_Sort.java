package sorting;

import java.util.Arrays;

public class Recursive_Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {5,2,10,3,1};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    static int[] insertionSort(int[] nums) {
        insertion(nums, nums.length);

        return nums;
    }

    static void insertion(int[] arr, int n) {
        // Base case
        if (n <= 1) {
            return;
        }

        // Sort the first n-1 elements
        insertion(arr, n - 1);

        // Insert the last element into its correct position
        for (int j = n - 1; j > 0; j--) {
            if (arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
            } else {
                break;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
