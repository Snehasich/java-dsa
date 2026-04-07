package HRD_Leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTraingle {
    public static void main(String[] args) {
        System.out.println(pascal(5));
    }

    static List<List<Integer>> pascal(int n) {
        int[][] arr = new int[n][n];

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<n; i++) {
            List<Integer> row = new ArrayList<>();

            for(int j = 0; j <=i ; j++) {
                if(i == j || j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
                row.add(arr[i][j]);
            }
            ans.add(row);
        }

        for (int i = 0; i < n; i++) {
            for(int j=n-i; j>0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }

        return ans;
    }
}
