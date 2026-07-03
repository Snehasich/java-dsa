package VTP_technical.Day5;

// V IMP ,  GOOGLE

import java.util.*;

public class MissingNumber_268 {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};

        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] arr) {
        int i=0;
        while(i < arr.length) {
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr,i,correct);
            } else {
                i++;
            }
        }

        // search 1st missing number
        for(int index = 0; index < arr.length; index++) {
            if(arr[index] != index) {
                return index;
            }
        }

        return arr.length;
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}
