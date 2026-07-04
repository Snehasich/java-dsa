package VTP_technical.Day6;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 0; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }

//        System.out.println();
//        int[] arr = new int[n+1];
//        for (int i = 0; i <= n; i++) {
//            arr[i] = fibArr(i, arr);
//        }
//        System.out.println(Arrays.toString(arr));

    }

    static int fib(int n) {
        if(n < 2) {             // base condition
            return n;
        }

        return fib(n-1) + fib(n-2);
    }

//    static int fibArr(int n, int[] arr) {
//        if(n < 2) {             // base condition
//            return n;
//        }
//
//        if(arr[n] < 2) {             // base condition
//            return arr[n];
//        }
//
//        arr[n] = fib(n-1, arr) + fib(n-2, arr);
//        return arr[n];
//    }
}

