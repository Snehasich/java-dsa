package arrays;

// https://leetcode.com/problems/max-consecutive-ones/

public class Max_Consecutive_Ones_485 {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};

        System.out.println(findMaxConsecutiveOnes(arr));
    }


    // optimize one
    static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        return max;
    }



//    static int findMaxConsecutiveOnes(int[] nums) {
//        int ans = 0;
//
//        for(int i=0; i<nums.length; i++) {
//            int count = 0;
//            for(int j=i; j<nums.length; j++) {
//                if(nums[j] != 0) {
//                    count++;
//                } else {
//                    break;
//                }
//            }
//
//            ans = Math.max(ans, count);
//        }
//
//        return ans;
//    }
}
