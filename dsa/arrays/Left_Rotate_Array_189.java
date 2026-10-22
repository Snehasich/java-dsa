package arrays;

// https://leetcode.com/problems/rotate-array/

//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]


import java.util.Arrays;

public class Left_Rotate_Array_189 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;

        rotate(arr, k);

        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] nums, int k) {
        k = k % nums.length;

        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    static void reverse(int[] arr, int left, int right) {
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
