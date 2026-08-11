package arrays;

import java.util.Arrays;

public class SetMisMatch {

    public static void main(String[] args) {
        int[] arr = {1,2,2,4};     // ans is [2,3]
        findErrorNums(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] findErrorNums(int[] arr) {
        int i=0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
                swap(arr,i,correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for(int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1) {
                return new int[] {arr[index], index+1};   // duplciate, no is missing
            }
        }
        return new int[] {-1,-1};
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
