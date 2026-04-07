package DSA_PRAC.Easy;

// Count even and odd numbers in an array

import java.util.*;

public class CountEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of elements : ");
        int n = sc.nextInt();

        int[] ele = new int[n];

        for(int i=0; i<n; i++) {
            System.out.println("Enter the elements : ");
            ele[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(ele));

        check(ele);
    }

    static void check(int[] arr) {

        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}
