package VTP_technical.Day3;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numArray = {2,4,5,67,78,89};

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        System.out.println(search(numArray, target));
    }

    static int search(int[] arr, int target) {

        int start = 0;
        int end = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
