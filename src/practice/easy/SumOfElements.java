package practice.easy;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        // find sum of elements in an array

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of elements : ");
        int n = sc.nextInt();

        int[] ele = new int[n];

        for(int i=0; i<n; i++) {
            System.out.println("Enter the elements : ");
            ele[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(ele));

        sum(ele);
    }

    static void sum(int[] arr) {
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum is : " + sum);
    }
}
