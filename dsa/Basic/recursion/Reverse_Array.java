package Basic.recursion;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println(Arrays.toString(reverseArray(arr)));
    }

    static int[] reverseArray(int[] nums) {
        return reverse(nums, 0, nums.length - 1);
    }

    static int[] reverse(int[] nums, int start, int end) {
        if(start >= end) return nums;

        //swap
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;

        return reverse(nums, start+1, end-1);
    }
}
