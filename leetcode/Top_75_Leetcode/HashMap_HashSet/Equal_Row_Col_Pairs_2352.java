package Top_75_Leetcode.HashMap_HashSet;

// https://leetcode.com/problems/equal-row-and-column-pairs/description/?envType=study-plan-v2&envId=leetcode-75

//Example 1:
//Input: grid = [[3,2,1],[1,7,6],[2,7,7]]
//Output: 1
//Explanation: There is 1 equal row and column pair:
//- (Row 2, Column 1): [2,7,7]

//Example 2:
//Input: grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
//Output: 3
//Explanation: There are 3 equal row and column pairs:
//- (Row 0, Column 0): [3,1,2,2]
//- (Row 2, Column 2): [2,4,2,2]
//- (Row 3, Column 2): [2,4,2,2]



public class Equal_Row_Col_Pairs_2352 {
    public static void main(String[] args) {
        int[][] grid = {
                {3,2,1},
                {1,7,6},
                {2,7,7}
        };

        System.out.println(equalPairs(grid));
    }

    static int equalPairs(int[][] grid) {
        int ans = 0;

        for (int i = 0; i < grid.length; i++) {      // choose a row
            for (int j = 0; j < grid.length; j++) {     // choose a column
                boolean equal = true;
                for(int k = 0; k < grid.length; k++) {      // compare each position
                    if(grid[i][k] != grid[k][j]) {
                        equal = false;
                        break;
                    }
                }

                if(equal) {
                    ans++;
                }
            }

        }

        return ans;
    }
}
