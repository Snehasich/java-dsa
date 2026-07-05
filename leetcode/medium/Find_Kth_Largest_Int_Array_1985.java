package medium;

import java.util.*;

public class Find_Kth_Largest_Int_Array_1985 {
    public static void main(String[] args) {
        String[] nums = {"3","6","7","10"};
        int k = 4;

        System.out.println(kthLargestNumber(nums, k));
    }

    static String kthLargestNumber(String[] nums, int k) {

        Arrays.sort(nums, (a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();   // ascending by length
            }
            return a.compareTo(b);                // ascending lexicographically
        });

        return nums[nums.length - k];
    }}
