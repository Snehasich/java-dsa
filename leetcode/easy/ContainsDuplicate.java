package easy;

// https://leetcode.com/problems/contains-duplicate/?envType=problem-list-v2&envId=array
// 217. Contains Duplicate

import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};

        System.out.println(containsDuplicate(nums));
    }

    static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);

            if(set.contains(num)) {
                return true;
            }
        }

        return false;
    }
}
