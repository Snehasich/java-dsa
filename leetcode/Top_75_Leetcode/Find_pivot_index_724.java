package Top_75_Leetcode;

// https://leetcode.com/problems/find-pivot-index/description/?envType=study-plan-v2&envId=leetcode-75

//Example 1:
//Input: nums = [1,7,3,6,5,6]
//Output: 3
//Explanation:
//The pivot index is 3.
//Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//Right sum = nums[4] + nums[5] = 5 + 6 = 11

//Example 2:
//Input: nums = [1,2,3]
//Output: -1
//Explanation:
//There is no index that satisfies the conditions in the problem statement.



public class Find_pivot_index_724 {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};

        System.out.println(pivotIndex(nums));
    }

    static int pivotIndex(int[] nums) {

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
