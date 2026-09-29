package companies.ibm.Solve_This;

// https://leetcode.com/problems/number-of-islands/description/

public class No_Of_Island_200 {
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        System.out.println(numIslands(grid));
    }

    static int numIslands(char[][] grid) {

        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == '1') {

                    count++;

                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    static void dfs(char[][] grid, int row, int col) {

        // Outside the grid
        if (row < 0 || row >= grid.length ||
                col < 0 || col >= grid[0].length) {
            return;
        }

        // Water
        if (grid[row][col] == '0') {
            return;
        }

        // Mark as visited
        grid[row][col] = '0';

        // Up
        dfs(grid, row - 1, col);

        // Down
        dfs(grid, row + 1, col);

        // Left
        dfs(grid, row, col - 1);

        // Right
        dfs(grid, row, col + 1);
    }
}
