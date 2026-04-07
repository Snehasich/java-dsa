package HRD_Placement_DSA;

// Input: n = 13, m = 4
//  Output: 12
//  Explanation: 12 is the closest to 13, divisible by 4.
//
// Input: n = -15, m = 6
//  Output: -18
//  Explanation: Both -12 and -18 are closest to -15, but -18 has the maximum absolute value.

import java.util.Arrays;

public class ClosestNumber {
    public static void main(String[] args) {

        int n = -15;
        int m = 6;

        System.out.println(binarySearch(n,m));
    }


    static int binarySearch(int n, int m) {

        int[] check = new int[11];

//        if(n < 1) {
//            n = -1 * n;
//        }

        n = Math.abs(n);

        for(int j=0; j<=10;j++) {
            check[j] = (m * j);
        }
        System.out.println(Arrays.toString(check));

        int start = 1;
        int end = check.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(check[mid] == n) {
                return check[mid];
            } else if(check[mid] > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

//        if(n < 1) {
//            return -1 * check[start-1];
//        }
//        return check[start];

        int n2 = check[start - 1];

        return n < 1 ? -n2 : check[start];

    }
}
