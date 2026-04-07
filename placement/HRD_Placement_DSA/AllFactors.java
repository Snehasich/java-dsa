package HRD_Placement_DSA;

// Input: n = 10
//Output: [1, 2, 5, 10]
//Explanation: 1, 2, 5 and 10 are the divisors of 10.
//
//Input: n = 100
//Output: [1, 2, 4, 5, 10, 20, 25, 50, 100]
//Explanation: 1, 2, 4, 5, 10, 20, 25, 50 and 100 are divisors of 100.

import java.util.ArrayList;

public class AllFactors {
    public static void main(String[] args) {
        int n = 100;

        factor(n);
    }

    static void factor(int n) {

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                arr.add(i);
            }
        }

        System.out.println(arr);
    }
}
