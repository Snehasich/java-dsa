package easy;

// https://leetcode.com/problems/contains-duplicate-ii/description/
// 219. Contains Duplicate II

// Example 1:
//Input: nums = [1,2,3,1], k = 3
//Output: true

//Example 2:
//Input: nums = [1,0,1,1], k = 1
//Output: true

//Example 3:
//Input: nums = [1,2,3,1,2,3], k = 2
//Output: false

import java.util.*;
public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;

        System.out.println(containsNearbyDuplicate(nums, k));
    }

    static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);

            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }
}

