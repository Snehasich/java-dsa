package VTP_technical.Day3;

import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] mat1 = {
                {1, 3, 5},
                {4, 5, 7}
        };

        int[][] mat2 = {
                {1, 2},
                {2, 3},
                {5, 6}
        };


        int[][] mul = multiplyMatrix(mat1, mat2);

        System.out.println(Arrays.deepToString(mul));
    }

    static int[][] multiplyMatrix(int[][] mat1, int[][] mat2) {

        int r1 = mat1.length;
        int c1 = mat1[0].length;

        int r2 = mat2.length;
        int c2 = mat2[0].length;

        if (c1 != r2) {
            return new int[0][0];
        }

        int[][] result = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        return result;
    }
}
