package DSA_PRAC.Easy;

// Search an element using Linear Search

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            System.out.println("Enter the elements : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the target : ");
        int target = sc.nextInt();

        boolean b = false;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                b = true;
            } else {
                b = false;
            }
        }

        if(b == true) {
            System.out.println("Found Target");
        } else {
            System.out.println("Not Found");
        }


    }
}

