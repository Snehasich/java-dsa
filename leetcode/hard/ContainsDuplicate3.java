package hard;

// https://leetcode.com/problems/contains-duplicate-iii/
// 220. Contains Duplicate III


// Example 1:
//Input: nums = [1,2,3,1], indexDiff = 3, valueDiff = 0
//Output: true
//Explanation: We can choose (i, j) = (0, 3).
//We satisfy the three conditions:
//i != j --> 0 != 3
//abs(i - j) <= indexDiff --> abs(0 - 3) <= 3
//abs(nums[i] - nums[j]) <= valueDiff --> abs(1 - 1) <= 0

//Example 2:
//Input: nums = [1,5,9,1,5,9], indexDiff = 2, valueDiff = 3
//Output: false
//Explanation: After trying all the possible pairs (i, j), we cannot satisfy the three conditions, so we return false.

import java.util.*;
public class ContainsDuplicate3 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsNearbyAlmostDuplicate(nums, 3, 0));
    }

    static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

        if (valueDiff < 0) return false;

        Map<Long, Long> bucket = new HashMap<>();
        long size = (long) valueDiff + 1; // bucket size

        for (int i = 0; i < nums.length; i++) {

            long num = nums[i];
            long id = getBucketId(num, size);

            // 1. Same bucket
            if (bucket.containsKey(id)) return true;

            // 2. Left neighbor
            if (bucket.containsKey(id - 1) &&
                    Math.abs(num - bucket.get(id - 1)) <= valueDiff) return true;

            // 3. Right neighbor
            if (bucket.containsKey(id + 1) &&
                    Math.abs(num - bucket.get(id + 1)) <= valueDiff) return true;

            // Add to window
            bucket.put(id, num);

            // 🪟 Slide window (remove old element)
            if (i >= indexDiff) {
                long old = nums[i - indexDiff];
                long oldId = getBucketId(old, size);
                bucket.remove(oldId);
            }
        }

        return false;
    }

    static long getBucketId(long num, long size) {
        if (num >= 0) return num / size;
        return (num + 1) / size - 1; // handles negatives correctly
    }
}
