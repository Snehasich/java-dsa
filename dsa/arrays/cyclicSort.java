package dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 0 to n  -> every element will be at index = value
// 1 to n  -> every element will be at index = value-1

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        missingNumber(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i=0;

        while(i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
                swap(arr,i,correct);
            } else {
                i++;
            }
        }
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


        // search for 1st missing no
//        for(int index=0; index < arr.length; index++) {
//            if(arr[index] != index) {
//                return index;
//            }
//        }



        // just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for(int index=0; index < arr.length; index++) {
            if(arr[index] != index+1) {
                ans.add(index+1);
            }
        }



        // case 2
//        return arr.length;  -> index 3
        // return ans;  // -> value 3 in arr
        return 0;
    }

    static int duplicate(int[] arr) {
        int i=0;
        while(i < arr.length) {

            if(arr[i] != i+1) {
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct]) {
                    swap(arr,i,correct);
                } else {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
