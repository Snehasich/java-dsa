package medium;

// Concept: Swap elements using two-pointer.
// Problem: Reverse Array – GFG


import java.util.Arrays;

public class SwapUsingTwoPointer {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        System.out.println("Before reverse : " + Arrays.toString(arr));
        swapTwoPointer(arr);
    }

    static void swapTwoPointer(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        int[] reverse = new int[arr.length];

        for(int i=start; i<=end; i++) {
            reverse[i] = arr[arr.length-i-1];
        }


        System.out.println("After reverse : " + Arrays.toString(reverse));


//         int left = 0;
//         int right = arr.length-1;
//         while(left < right) {
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left++;
//            right--;
//         }
//         System.out.println(Arrays.toString(arr));
    }

}
