package VTP_technical.Day7;

public class Subarray_Sum_Equals_k_560 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 2;

        System.out.println(subarraySum(nums, k));
    }

    static int subarraySum(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if(sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

}
