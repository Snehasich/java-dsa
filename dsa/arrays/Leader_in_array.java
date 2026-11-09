package arrays;

// Example 1:
//Input: nums = [1, 2, 5, 3, 1, 2]
//Output: [5, 3, 2]
//Explanation: 2 is the rightmost element, 3 is the largest element in the index range [3, 5], 5 is the largest element in the index range [2, 5]
//
//Example 2:
//Input: nums = [-3, 4, 5, 1, -4, -5]
//Output: [5, 1, -4, -5]
//Explanation: -5 is the rightmost element, -4 is the largest element in the index range [4, 5], 1 is the largest element in the index range [3, 5] and 5 is the largest element in the range [2, 5]


import java.util.*;

public class Leader_in_array {
    public static void main(String[] args) {
        int[] nums = {1,2,5,3,1,2};

        System.out.println(leaders(nums));
    }

    static List<Integer> leaders(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] > max) {
                ans.add(nums[i]);
                max = nums[i];
            }
        }

        Collections.reverse(ans);
        return ans;
    }
}
