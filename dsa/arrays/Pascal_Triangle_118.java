package arrays;

// https://leetcode.com/problems/pascals-triangle/description/

//Example 1:
//Input: numRows = 5
//Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

//Example 2:
//Input: numRows = 1
//Output: [[1]]


import java.util.*;

public class Pascal_Triangle_118 {
    public static void main(String[] args) {
        int numRows = 5;

        System.out.println(generate(numRows));
    }

    static List<List<Integer>> generate(int n) {
        int[][] arr = new int[n][n];
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<n; i++) {
            List<Integer> a = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(i == j || j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }

                a.add(arr[i][j]);
            }
            ans.add(a);
        }

//        System.out.println(Arrays.deepToString(arr));

        return ans;
    }
}
