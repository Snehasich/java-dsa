package VTP_technical.Day5;

// V IMP    MOST Companies

public class MaximumSubarray_53 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2 = {5,4,-1,7,8};

        System.out.println(maxSubArray(nums2));
    }

    static int maxSubArray(int[] nums) {
        int ans = nums[0];
        int current = nums[0];

        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current+nums[i]);
            ans = Math.max(ans, current);
        }

        return ans;
    }

//    static int maxSubArray2(int[] nums) {
//        int sum = Integer.MIN_VALUE;
//        int max = sum;
//
//        for (int i = 1; i < nums.length; i++) {
//            if (sum < 0) {
//                sum += nums[i];
//            }
//
//            if(sum > max) {
//                max = sum;
//            }
//        }
//
//        return max;
//    }
}