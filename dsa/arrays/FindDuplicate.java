package arrays;

//  MICRODOFT

import java.util.Arrays;

public class FindDuplicate {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};     // ans is 2
        findDuplicate(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int findDuplicate(int[] arr) {

        int i=0;
        while(i < arr.length) {
            if(arr[i] != i+1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
