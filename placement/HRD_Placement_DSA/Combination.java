package HRD_Placement_DSA;

// Input: n = 5, r = 2
// Output: 10
// Explanation: The value of 5C2 is calculated as 5! / ((5−2)! * 2!​)= 10.

// Input: n = 2, r = 4
// Output: 0
// Explanation: Since r is greater than n, thus 2C4 = 0

// Input: n = 5, r = 0
// Output: 1
// Explanation: The value of 5C0 is calculated as 5!/(5−0)!*0! = 5!/5!*0! = 1.

public class Combination {
    public static void main(String[] args) {

        int n = 2, r = 4;
        if(r > n) {
            System.out.println(0);
        } else if(r == 0 || r == n) {
            System.out.println(1);
        } else {
            System.out.println(comb(n,r));
        }

    }

    static int comb(int n, int r) {

        // n! / r! * (n-r)!

        return fact(n) / (fact(r) * fact(n-r));
    }

    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
