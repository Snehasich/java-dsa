package VTP_technical.Day3;

import java.util.*;

public class MatrixDegree {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("How much Degree to turn : ");
        int degree = sc.nextInt();

        if(degree % 90 == 0) {
            int rotationCount = degree / 90;
            if(rotationCount % 4 != 0) {
                if(rotationCount % 4 == 1) {
                    rotate90Clockwise(arr);
                }
                if(rotationCount % 4 == 2) {
                    rotate90Clockwise(arr);
                    rotate90Clockwise(arr);
                } else if(rotationCount % 4 == 3) {
                    rotate90Clockwise(arr);
                    rotate90Clockwise(arr);
                    rotate90Clockwise(arr);
                }
            } else {
                System.out.println("Not Rotating");
            }
        }

        // other way using FOR loop
        //int rotationCount = (degree / 90) % 4;
        //for (int i = 0; i < rotationCount; i++) {
        //    rotate90Clockwise(arr);
        //}
    }

    static int[][] rotate90Clockwise(int[][] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //reverse
        for (int[] a : arr) {
            reverseArray1D(a);
        }

        return arr;
    }

    static void reverseArray1D(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
