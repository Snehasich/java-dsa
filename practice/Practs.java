public class Practs {
    public static void main(String[] args) {
        //Input: nums = [1, 2, 3, 4, 5, 6], k = 2
        //Output: nums = [3, 4, 5, 6, 1, 2]

        int[] arr = {1,2,3,4,5,6};
        rotateArray(arr, 2);
    }

    static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        reverse(nums, 0, n-1);
    }

    static void reverse(int[] nums, int left, int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}
