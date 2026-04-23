package medium;

// https://leetcode.com/problems/single-number-ii/description/
// 137. Single Number II


// Example 1:
//Input: nums = [2,2,3,2]
//Output: 3

//Example 2:
//Input: nums = [0,1,0,1,0,1,99]
//Output: 99

public class SingleNumber2 {
    public static void main(String[] args) {
        int[] nums = {2,2,3,2};
        System.out.println(singleNumber(nums));
    }

// NOT OPTIMIZE CODE
//    static int singleNumber(int[] nums) {
//        for(int i=0; i<nums.length; i++) {
//            int count = 0;
//            for(int j=0; j<nums.length; j++) {
//                if(nums[i] == nums[j] && i != j) {
//                    count++;
//                }
//            }
//            if(count == 0) {
//                return nums[i];
//            }
//        }
//        return -1;
//    }

    static int singleNumber(int[] nums) {
        int ones = 0, twos = 0;

        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }

        return ones;
    }

}
