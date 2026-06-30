package VTP_technical.Day2;

import java.util.Arrays;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] mat1 = {
                {1,3,5},
                {4,5,7}
        };
        int[][] mat2 = {
                {1,2,1},
                {2,3,7}
        };

        int[][] sum = new int[mat1.length][mat2[0].length];

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        System.out.println(Arrays.deepToString(sum));
    }
}
