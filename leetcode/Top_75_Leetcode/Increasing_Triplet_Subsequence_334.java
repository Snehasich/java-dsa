package Top_75_Leetcode;

// https://leetcode.com/problems/increasing-triplet-subsequence/description/?envType=study-plan-v2&envId=leetcode-75



// Example 1:
//Input: nums = [1,2,3,4,5]
//Output: true
//Explanation: Any triplet where i < j < k is valid.

//Example 2:
//Input: nums = [5,4,3,2,1]
//Output: false
//Explanation: No triplet exists.

//Example 3:
//Input: nums = [2,1,5,0,4,6]
//Output: true
//Explanation: One of the valid triplet is (1, 4, 5), because nums[1] == 1 < nums[4] == 4 < nums[5] == 6.


public class Increasing_Triplet_Subsequence_334 {
    public static void main(String[] args) {
        int[] nums = {2,1,5,0,4,6};

        System.out.println(increasingTriplet(nums));
    }

    static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int num : nums) {
            if(num <= first) {
                first = num;
            } else if(num <= second) {
                second = num;
            } else {
                return true;
            }
        }

        return false;
    }
}
