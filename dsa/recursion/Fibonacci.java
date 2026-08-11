package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        //i0,1,2,3,4,5,6,7,...   index
        // 0,1,1,2,3,5,8,13....

        int n = 6;
        System.out.println(fib(n));

    }

    static int fib(int n) {
        if(n == 0 || n == 1){     // or n < 2
            return n;
        }
        return fib(n-1) + fib(n-2);

        // known as RECURRENCE RELATION
        // break it down into smaller problems
        // using recursive TREE
    }
}
