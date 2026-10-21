package sorting;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        // it uses divide and merge(Conquer)
        int[] arr = {6,3,9,5,2,8};
        int n = arr.length;

        divide(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void divide(int[] arr, int startIndex, int endIndex) {
        if(startIndex < endIndex) {
            int mid = startIndex + (endIndex - startIndex) / 2;

            divide(arr, startIndex, mid);
            divide(arr, mid + 1, endIndex);
            conquer(arr, startIndex, mid, endIndex);
        }
    }

    static void conquer(int[] arr, int start, int mid, int end) {
        int[] merged = new int[end - start + 1];

        int idx1 = start;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <= end) {     // compare 2 divides array, first index with other index and check which less store that in temporary array
            if(arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while(idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while(idx2 <= end) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = start; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
}
