package easy;

// Google Question

// https://leetcode.com/problems/happy-number/description/
// 202. Happy Number

// Cycle detection (Floyd’s Algorithm)

// Example 1:
//Input: n = 19
//Output: true
//Explanation:
//1^2 + 9^2 = 82
//8^2 + 2^2 = 68
//6^2 + 8^2 = 100
//1^2 + 0^2 + 0^2 = 1

//Example 2:
//Input: n = 2
//Output: false

public class Happynumber {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n));
    }

    static boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if(slow == 1) {
            return true;
        }

        return false;
    }

    static int findSquare(int number) {
        int ans = 0;

        while(number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }

}
