package Basic.recursion;

public class Sum_Array_Ele {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        System.out.println(arraySum(arr));
    }

    static int arraySum(int[] nums) {
        return recursion(nums, 0);
    }

    static int recursion(int[] nums, int i) {
        if(i == nums.length) return 0;

        return nums[i] + recursion(nums, i + 1);
    }
}
