package DSA_PRAC.Easy;

import java.util.*;

// reverse an array

public class ReverseArray {
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

        reverse(ele);
    }

    static void reverse(int[] arr) {
        int[] temp = new int[arr.length];

        for(int i=0; i<=arr.length-1; i++) {
            temp[i] = arr[arr.length - i - 1];
        }

        System.out.println(Arrays.toString(temp));

        // int start = 0;
        //        int end = arr.length - 1;
        //
        //        while (start < end) {
        //            int temp = arr[start];
        //            arr[start] = arr[end];
        //            arr[end] = temp;
        //
        //            start++;
        //            end--;
        //        }
    }
}
