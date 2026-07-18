package Top_75_Leetcode;

// https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=study-plan-v2&envId=leetcode-75

//Example 1:
//Input: nums = [1,12,-5,-6,50,3], k = 4
//Output: 12.75000
//Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

//Example 2:
//Input: nums = [5], k = 1
//Output: 5.00000

public class Max_Avg_Subarray_643 {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;

        System.out.println(findMaxAverage(nums, k));
    }

    static double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        // Sum of first window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {

            sum = sum + nums[i] - nums[i - k];

            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
}
