package practice.medium;

// Given an array arr[] and an integer k, we need to calculate the maximum sum of a subarray having size exactly k.
// Input  : arr[] = [5, 2, -1, 0, 3], k = 3
// Output : 6
// Explanation : We get maximum sum by considering the subarray [5, 2, -1]

public class MaxSumSubarray {
    public static void main(String[] args) {
        int[] arr = {5, 2, -1, 0, 3};
        int size = 3;

        maxSumSubArray(arr, size);
    }

    static void maxSumSubArray(int[] arr, int k) {

        int max = 0;


        for(int i=0; i<=arr.length-k; i++) {

            int sum = 0;
            for(int j=i; j<i+k; j++) {
                sum += arr[j];
            }
            if(sum > max) {
                max = sum;
            }

        }

        System.out.println("Max : " + max);

    }
}
