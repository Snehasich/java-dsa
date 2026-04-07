package leetcode.easy;

class ClimbStairs {
    public static void main(String[] args) {
        int n = 3;

        System.out.println(climbStairs(n));
    }

    static int climbStairs(int n) {
        return helper(n, 1, 2);
    }

    static int helper(int n, int a, int b) {

        if(n == 1) return a;
        if(n == 2) return b;

        return helper(n - 1, b, a + b);

    }
}
