package easy;

// https://leetcode.com/problems/merge-sorted-array
// 88. Merge Sorted Array

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]

// Input: nums1 = [1], m = 1, nums2 = [], n = 0
// Output: [1]

// Input: nums1 = [0], m = 0, nums2 = [1], n = 1
// Output: [1]

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
        int m = 3, n = 3;

        merge(nums1, m, nums2, n);
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m+n - 1;

        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // if nums2 still has elements
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        System.out.println(Arrays.toString(nums1));
    }


}
