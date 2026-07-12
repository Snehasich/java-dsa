package Top_75_Leetcode;

// https://leetcode.com/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=leetcode-75

// Example 1:
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]

//Example 2:
//Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]


import java.util.Arrays;

public class Product_Array_Except_Self_238 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

//    static int[] productExceptSelf(int[] nums) {
//        int[] res = new int[nums.length];
//
//        for(int i = 0; i < nums.length; i++) {
//            int product = 1;
//            for(int j = 0; j < nums.length; j++) {
//                if(i != j) {
//                    product *= nums[j];
//                }
//            }
//
//            res[i] = product;
//        }
//
//        return res;
//    }

    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        // Step 1: Store left products
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            res[i] = prefix;
            prefix *= nums[i];
        }

        // Step 2: Multiply by right products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= suffix;
            suffix *= nums[i];
        }

        return res;
    }
}
