package Top_75_Leetcode;

// https://leetcode.com/problems/max-number-of-k-sum-pairs/description/?envType=study-plan-v2&envId=leetcode-75

// Example 1:
//Input: nums = [1,2,3,4], k = 5
//Output: 2
//Explanation: Starting with nums = [1,2,3,4]:
//- Remove numbers 1 and 4, then nums = [2,3]
//- Remove numbers 2 and 3, then nums = []
//There are no more pairs that sum up to 5, hence a total of 2 operations.

//Example 2:
//Input: nums = [3,1,3,4,3], k = 6
//Output: 1
//Explanation: Starting with nums = [3,1,3,4,3]:
//- Remove the first two 3's, then nums = [1,4,3]
//There are no more pairs that sum up to 6, hence a total of 1 operation.


import java.util.ArrayList;
import java.util.Arrays;

public class Max_Number_KSum_Pairs_1679 {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,3};
        int k = 6;

        System.out.println(maxOperations(nums, k));
    }

//    static int maxOperations(int[] nums, int k) {
//        ArrayList<Integer> list = new ArrayList<>();
//        int count = 0;
//
//        for(int i = 0; i < nums.length; i++) {
//            list.add(nums[i]);
//        }
//        System.out.println(list);
//
//        for(int i = 0; i < list.size(); i++) {
//            for(int j = i + 1; j < list.size(); j++) {
//                if(list.get(i) + list.get(j) == k) {
//                    count++;
//                    list.remove(j);
//                    list.remove(i);
//                    i = -1;           // because the for-loop will do i++
//                    break;
//                }
//            }
//        }
//
//        return count;
//    }



    static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        int count = 0;

        while(left < right) {
            int sum = nums[left] + nums[right];

            if(sum == k) {
                count++;
                left++;
                right--;
            } else if(sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}
