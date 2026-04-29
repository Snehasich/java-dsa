package medium;

// https://leetcode.com/problems/subsets/description/
// 78. Subsets


// Example 1:
//Input: nums = [1,2,3]
//Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

//Example 2:
//Input: nums = [0]
//Output: [[],[0]]

import java.util.*;

public class SubSets {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subsets(arr));
    }

    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans, new ArrayList<>(), nums, 0);
        return ans;
    }

    static void solve(List<List<Integer>> ans, List<Integer> temp, int[] nums, int idx) {
        ans.add(new ArrayList<>(temp));

        for(int i = idx; i < nums.length; i++) {
            temp.add(nums[i]);
            solve(ans, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
