package VTP_technical;

import java.util.*;

class SecondLargestNumber {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int k = 2;

        System.out.println(Arrays.toString(arr));
        reverse(arr, 0,  arr.length - 1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static int[] reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return arr;
    }
}
