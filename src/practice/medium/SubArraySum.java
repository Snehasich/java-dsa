package DSA_PRAC.Medium;

// Subarray SumConcept: Cumulative sum and prefix technique.
// Problem: Subarray Sum Equals K – LeetCode 560

public class SubArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 3;

        System.out.println(subarraySum(arr, k));
    }

    static int subarraySum(int[] nums, int k) {
        int c = 0;

        for(int i=0; i<nums.length; i++) {
            int sum = 0;
            for(int j=i; j<nums.length; j++) {
                sum += nums[j];

                if(sum == k) {
                    c++;
                }
            }
        }


        return c;
    }
}
