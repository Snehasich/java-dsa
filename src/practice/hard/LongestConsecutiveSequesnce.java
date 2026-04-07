package practice.hard;

import java.util.*;

public class LongestConsecutiveSequesnce {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }

    static int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet();

        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }

        System.out.println(set);

        int count = 1;

        for(int i=0; i<set.size()-1; i++) {
            if(set.contains(nums[i])) {
                count++;
            }
        }

        return count;
    }
}
