package VTP_technical;

import java.util.*;

class SecondLargestNumber {
    public static void main(String[] args) {

        String[] nums = {"3","6","7","10"};
        int k = 4;

        System.out.println(kthLargestNumber(nums, k));
    }

    static String kthLargestNumber(String[] nums, int k) {
        String ans = "";

        int[] intArr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            intArr[i] = Integer.parseInt(nums[i]);
        }

        for(int i = k-1; i >= 0; i--){
            ans = nums[i];
        }

        System.out.println(Arrays.toString(intArr));

        return ans;
    }
}
