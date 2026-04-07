package DSA_PRAC.Easy;

import java.util.*;

// Find second largest element in an array

public class SecondLargest {
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

        secondLargest(ele);
    }

    static void secondLargest(int[] arr) {

        Arrays.sort(arr);

        int max = arr[arr.length-1];

        if (arr.length < 2) {
            System.out.println("Second largest element does not exist");
            return;
        }

        for(int i=arr.length-1; i>0; i--) {
            if(arr[i] != max) {
                System.out.println("Second largest : " + arr[i]);
                return;
            }
        }

        System.out.println("Does not exist");
    }
}
