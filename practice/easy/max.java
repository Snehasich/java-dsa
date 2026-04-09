package easy;

// max ele in an array

import java.util.*;

public class max {
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

        maximum(ele);
    }

    static void maximum(int[] arr) {
        int max = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
