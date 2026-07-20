package Top_75_Leetcode;

// https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/?envType=study-plan-v2&envId=leetcode-75


//Example 1:
//Input: nums = [1,1,0,1]
//Output: 3
//Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.


//Example 2:
//Input: nums = [0,1,1,1,0,1,1,0,1]
//Output: 5
//Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].





public class Longest_Subarray_1s_1493 {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,0,1,1,0,1};

        System.out.println(longestSubarray(nums));
    }

    static int longestSubarray(int[] nums) {
        int left = 0;
        int zeros = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zeros++;
            }

            while (zeros > 1) {

                if (nums[left] == 0) {
                    zeros--;
                }

                left++;
            }

            ans = Math.max(ans, right - left);
        }

        return ans;
    }
}
