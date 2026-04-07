package HRD_Placement_DSA;

// Input: n = 4
//Output: 2
//Explanation: The square root of 4 is 2.
//
//Input: n = 11
//Output: 3
//Explanation: The square root of 11 lies in between 3 and 4 so floor of the square root is 3.


import java.util.Arrays;

public class SquareRootInteger {
    public static void main(String[] args) {
        int n = 11;

        System.out.println(squareRootInteger(n));
        System.out.println(binary(n));
    }

    static int squareRootInteger(int n) {

        int ans = 1;

        for(int i=0; i<=n; i++) {
            if((ans * ans) == n) {
                return ans;
            } else if((ans * ans) > n) {        // 3 = 9 < 11 && 4 = 16 > 11
                return ans - 1;                 // so ans = 4 , 4 - 1 = 3, floor is 3
            }
            ans++;
        }


        return ans;
    }

    static int binary(int n) {

        int[] a = new int[n+1];

        for(int i=1; i<n+1; i++) {
            a[i] = i*i;
        }

        System.out.println(Arrays.toString(a));

        int start = 0;
        int end = a.length - 1;

        // [0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121]

        while(start <= end) {
            int mid = start + (end - start) / 2;      // (start + end) / 2

            if(a[mid] == n) {
                return mid;
            } else if(a[mid] < n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;

    }
}
