package Top_75_Leetcode;

// https://leetcode.com/problems/move-zeroes/description/?envType=study-plan-v2&envId=leetcode-75


// Example 1:
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]

//Example 2:
//Input: nums = [0]
//Output: [0]


import java.util.Arrays;

public class Move_Zeroes_283 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};

        moveZeroes(arr);
    }

//    static void moveZeroes(int[] arr) {
//
//        int[] newarr = new int[arr.length];
//
//        int j = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                newarr[j++] = arr[i];
//            }
//        }
//
//        // Copy back to original array
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = newarr[i];
//        }
//
//        System.out.println(Arrays.toString(arr));
//    }


    static void moveZeroes(int[] arr) {
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp  = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
