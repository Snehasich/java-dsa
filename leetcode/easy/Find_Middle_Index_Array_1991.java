package easy;

// https://leetcode.com/problems/find-the-middle-index-in-array/description/
// 1991. Find the Middle Index in Array

//Example 1:
//Input: nums = [2,3,-1,8,4]
//Output: 3
//Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
//The sum of the numbers after index 3 is: 4 = 4

//Example 2:
//Input: nums = [1,-1,4]
//Output: 2
//Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
//The sum of the numbers after index 2 is: 0


public class Find_Middle_Index_Array_1991 {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};

        System.out.println(findMiddleIndex(nums));
    }

    static int findMiddleIndex(int[] nums) {

        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for(int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int[] suffix = new int[nums.length];
        suffix[nums.length - 1] = nums[nums.length - 1];

        for(int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + nums[i];
        }

        for(int i = 0; i < nums.length; i++) {

            int left, right;

            if(i == 0)
                left = 0;
            else
                left = prefix[i - 1];

            if(i == nums.length - 1)
                right = 0;
            else
                right = suffix[i + 1];

            if(left == right)
                return i;
        }

        return -1;
    }
}
