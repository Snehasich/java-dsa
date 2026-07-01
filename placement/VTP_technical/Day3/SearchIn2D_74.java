package VTP_technical.Day3;

public class SearchIn2D_74 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;

        System.out.println(searchMatrix(matrix, target));
        System.out.println(searchMatrixOptimize(matrix, target));

    }

    static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean searchMatrixOptimize(int[][] arr, int target) {

        int n = arr.length; // row  /  no of 1D array
        int m = arr[0].length;  // column  /  no of elements within the 1D array

        int i = 0, j = arr[0].length - 1;

        while(i < arr.length && j >= 0) {
            if(arr[i][j] == target) {
                return true;
            } else if(target < arr[i][j]) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }
}
