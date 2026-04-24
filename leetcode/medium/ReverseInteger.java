package medium;

// https://leetcode.com/problems/reverse-integer/description/
// 7. Reverse Integer


// Example 1:
//Input: x = 123
//Output: 321

//Example 2:
//Input: x = -123
//Output: -321

//Example 3:
//Input: x = 120
//Output: 21


public class ReverseInteger {
    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
    }

    static int reverse(int x) {
        long rev = 0;

        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) rev;
    }
}
