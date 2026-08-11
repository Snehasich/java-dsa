package arrays;

// AMAZON

import java.util.Arrays;

class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {4,0,2,1};     // here output should be 3 because 3 is missing so we will compare arr[i] with index
        System.out.println("Missing number : " + missingNumber(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static int missingNumber(int[] arr) {
        int i=0;
        while(i < arr.length) {
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr,i,correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for(int index = 0; index < arr.length; index++) {
            if(arr[index] != index) {
                return index;
            }
        }

        // case2
        return arr.length;
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}