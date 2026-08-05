package easy;

// https://leetcode.com/problems/find-missing-elements/description/?envType=daily-question&envId=2026-08-04

//Example 1:
//Input: nums = [1,4,2,5]
//Output: [3]
//Explanation:
//The smallest integer is 1 and the largest is 5, so the full range should be [1,2,3,4,5]. Among these, only 3 is missing.

//Example 2:
//Input: nums = [7,8,6,9]
//Output: []
//Explanation:
//The smallest integer is 6 and the largest is 9, so the full range is [6,7,8,9]. All integers are already present, so no integer is missing.

//Example 3:
//Input: nums = [5,1]
//Output: [2,3,4]
//Explanation:
//The smallest integer is 1 and the largest is 5, so the full range should be [1,2,3,4,5]. The missing integers are 2, 3, and 4.


import java.util.*;

public class Find_Missing_Elements_3731 {
    public static void main(String[] args) {
        int[] nums = {1,4,2,5};
//        int[] nums = {5,1};

        System.out.println(findMissingElements(nums));
    }
    static List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < nums.length-1; i++) {
            for(int j = nums[i] + 1; j < nums[i+1]; j++) {
                ans.add(j);
            }
        }

        return ans;
    }
}
