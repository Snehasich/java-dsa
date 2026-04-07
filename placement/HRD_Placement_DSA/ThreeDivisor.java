package HRD_Placement_DSA;

// Given a number n, print count of numbers in the range from 1 to n having exactly 3 divisors.
// Input: n = 16
//Output: 2
//Explanation: Only 4 and 9 have exactly three divisors.
//
//Input: n = 100
//Output: 4
//Explanation: 4, 9, 25 and 49 have exactly three divisors.


public class ThreeDivisor {
    public static void main(String[] args) {
        int n = 4;
        divisor(n);
    }

    static void divisor(int n) {
        int result = 0;

        for(int i=1; i<=n; i++) {
            int count = 0;
            for(int j=1; j<=n; j++) {
                if(i % j == 0) {
                    count++;
                }
            }

            if(count == 3) {
                result++;
            }
        }

        System.out.println(result);
    }
}

