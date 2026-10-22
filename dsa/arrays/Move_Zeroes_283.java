package arrays;

// https://leetcode.com/problems/move-zeroes/

//Example 1:
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]


import java.util.Arrays;

public class Move_Zeroes_283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }

    static void moveZeroes(int[] nums) {
        int j = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
    }
}
