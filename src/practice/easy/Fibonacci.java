package practice.easy;

public class Fibonacci {
    public static void main(String[] args) {

        // 0 1 1 2 3 5 8 13 21
        // 0 1 2 3 4 5 6 7 8

        int n = 3;

        System.out.println(fibo(n));
        System.out.println(fact(n));

    }

    static int fibo(int n) {
        if(n < 2) {
            return n;
        }

        return fibo(n-1) + fibo(n-2);

    }

    static int fact(int n) {
        if(n < 2) {
            return n;
        }

        return n * fact(n-1);

    }
}
