package arrays;

// https://leetcode.com/problems/majority-element/description/

//Example 1:
//Input: nums = [3,2,3]
//Output: 3

//Example 2:
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2



public class Majority_Element_169 {
    public static void main(String[] args) {
        int[] arr = {3,2,3};

        System.out.println(majorityElement(arr));
    }

    //      TIME COMPLEXITY PROBLEM
//    static int majorityElement(int[] nums) {
//        int max = 0;
//        int element = 0;
//
//        for(int i=0; i<nums.length; i++) {
//            int count = 0;
//            for(int j=i; j<nums.length; j++) {
//                if(nums[i] == nums[j]) {
//                    count++;
//                }
//            }
//
//            if(max < count) {
//                max = count;
//                element = nums[i];
//            }
//        }
//
//        return element;
//    }



    //   Boyer-Moore Voting Algorithm that solves this problem in O(n) time and O(1) space.

    static int majorityElement(int[] nums) {
        int element = 0;
        int count = 0;

        for(int num : nums) {
            if(count == 0) {
                element = num;
            }

            if(num == element) {
                count++;
            } else {
                count--;
            }
        }

        return element;
    }
}
