package VTP_technical.Day3;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numArray = {2,4,5,67,78,89};

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        System.out.println(search(numArray, target));
    }

    static int search(int[] arr, int target) {

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
