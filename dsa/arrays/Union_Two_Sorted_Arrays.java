package arrays;

//Example 1:
//Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]
//Output: [1, 2, 3, 4, 5, 7]
//Explanation: The elements 1, 2 are common to both, 3, 4, 5 are from nums1 and 7 is from nums2
//
//Example 2:
//Input: nums1 = [3, 4, 6, 7, 9, 9], nums2 = [1, 5, 7, 8, 8]
//Output: [1, 3, 4, 5, 6, 7, 8, 9]
//Explanation: The element 7 is common to both, 3, 4, 6, 9 are from nums1 and 1, 5, 8 is from nums2

import java.util.*;

public class Union_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5}, nums2 = {1, 2, 7};

        System.out.println(Arrays.toString(unionArray(nums1, nums2)));
    }

    static int[] unionArray(int[] nums1, int[] nums2) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            set.add(num);
        }

        return set.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
