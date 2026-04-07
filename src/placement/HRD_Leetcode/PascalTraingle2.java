package placement.HRD_Leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTraingle2 {
    public static void main(String[] args) {
        System.out.println(pascal(3));
    }

    static List<Integer> pascal(int rowIndex) {
        int n = rowIndex + 1;   // important fix
        int[][] arr = new int[n][n];

        // Build triangle
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                if(i == j || j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }

        // Extract required row
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            ans.add(arr[rowIndex][j]);
        }

        return ans;
    }
}
