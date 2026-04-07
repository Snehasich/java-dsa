package practice.medium;

// prog of binary search

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of elements : ");
        int n = sc.nextInt();

        int[] ele = new int[n];

        for(int i=0; i<n; i++) {
            System.out.println("Enter the elements : ");
            ele[i] = sc.nextInt();
        }

        System.out.println("Enter the target ele : ");
        int target = sc.nextInt();

        sort(ele);

        System.out.println(Arrays.toString(ele));



        System.out.println(search(ele,target));
    }

    static int search(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target == arr[mid]) {
                return mid;
            } else if(target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    static int[] sort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
