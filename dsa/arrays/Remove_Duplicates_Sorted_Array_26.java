package arrays;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

//Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]


import java.util.Arrays;

public class Remove_Duplicates_Sorted_Array_26 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};

        System.out.println(removeDuplicates(nums));
    }

    static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int unique = 1;

        for(int i=1; i < nums.length; i++) {
            if(nums[i] != nums[unique - 1]) {
                nums[unique] = nums[i];
                unique++;
            }
        }

        return unique;
    }
}
