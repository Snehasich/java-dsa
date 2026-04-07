package DSA_PRAC.Medium;

// Maximum Average Subarray I – LeetCode 643🌟 Maximum Average Subarray I (Simple Meaning)
// You are given:
//  👉 a list of numbers
//  👉 a number k Your job is:
//  👉 find k numbers that are next to each other
//  👉 whose average is the biggest

public class MaxAverageSubArray {
    public static void main(String[] args) {
        int[] arr = {-1};
        int size = 1;

        System.out.println(findMaxAverage(arr, size));
    }

    static double findMaxAverage(int[] arr, int k) {
        int add = 0;

        // First window
        for(int i = 0; i < k; i++) {
            add += arr[i];
        }

        double max = (double) add / k;

        // Remaining windows
        for(int i = 1; i <= arr.length - k; i++) {

            add = 0;

            for(int j = i; j < i + k; j++) {
                add += arr[j];
            }

            double avg = (double) add / k;

            if(avg > max) {
                max = avg;
            }
        }

        return max;
    }

    // my code wrong for different case if i check
//    static double findMaxAverage(int[] arr, int k) {
//        double max = 0;
//
//        for(int i=0; i<=arr.length-k; i++) {
//            double avg = 0;
//            int add = 0;
//
//            // sliding window
//            for(int j=i; j<i+k; j++) {
//
//                add += arr[j];
//            }
//
//            avg = (double) add / k;
//
//            if(avg > max) {
//                max = avg;
//            }
//        }
//        return max;
//    }
}
