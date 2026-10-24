package arrays;

// AMAZON

import java.util.Arrays;

class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {4,0,2,1};     // here output should be 3 because 3 is missing so we will compare arr[i] with index
        System.out.println("Missing number : " + missingNumber(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int original = n * (n + 1) / 2;

        for(int num : nums) {
            sum += num;
        }

        return original - sum;
    }

}