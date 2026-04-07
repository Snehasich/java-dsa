package practice.easy;

import java.util.Arrays;
import java.util.Scanner;

public class min {
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

        minimum(ele);
    }

    static void minimum(int[] arr) {
        int min = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}
