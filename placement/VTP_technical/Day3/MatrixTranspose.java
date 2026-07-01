package VTP_technical.Day3;

import java.util.Arrays;

// 90 degree rotate

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

//        System.out.println(Arrays.deepToString(matrixTranspose(arr)));
        System.out.println(Arrays.deepToString(reverseMatrix(arr)));
    }

    static int[][] matrixTranspose(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        return arr;
    }

    static int[][] reverseMatrix(int[][] arr) {
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
