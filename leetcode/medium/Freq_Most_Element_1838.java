package medium;

// https://leetcode.com/problems/frequency-of-the-most-frequent-element/

import java.util.Arrays;

public class Freq_Most_Element_1838 {
    public static void main(String[] args) {
        int[] nums = {1,4,8,13};
        int k = 5;

        System.out.println(maxFrequency(nums,k));
    }

    static int maxFrequency(int[] arr, int k) {
        Arrays.sort(arr);

        int i = 0;
        int ans = 1;
        long sum = 0;

        for (int j = 0; j < arr.length; j++) {

            sum += arr[j];

            while ((long) arr[j] * (j - i + 1) > sum + k) {
                sum -= arr[i];
                i++;
            }

            ans = Math.max(ans, j - i + 1);
        }

        return ans;
    }
}
