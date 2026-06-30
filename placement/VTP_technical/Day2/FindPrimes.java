package VTP_technical.Day2;

// amazon

// Sieve of Eratosthenes.
// Given a number n, print or find all prime numbers from 2 to n.


import java.util.*;

public class FindPrimes {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//
//        for(int ele : arr) {
//            System.out.print(ele + " ");
//        }
//        Arrays.fill(arr, 100);
//        Arrays.fill(arr, 1, 2, 50);
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        findPrimes(1000000);


    }

    static boolean prime(int n) {
        if(n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    static void findPrimes(int n) {

        boolean[] isPrime = new boolean[n + 1];

        Arrays.fill(isPrime, true);

        if (n >= 0) isPrime[0] = false;
        if (n >= 1) isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {

            if (isPrime[i]) {

                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }

            }

        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
