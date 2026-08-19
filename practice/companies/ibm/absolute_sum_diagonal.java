package companies.ibm;

public class absolute_sum_diagonal {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {9,8,9}
        };

        // 1+5+9 = 15, 3+5+9 = 17,
        // 17-15 = 2

        System.out.println(diag(arr));
    }

    static int diag(int[][] arr) {
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr[i].length; j++){
//                if(i == j) {
//                    sum1 += arr[i][j];
//                }
//
//                if(arr.length - 1 - i == j) {
//                    sum2 += arr[i][j];
//                }
//            }

            sum1 += arr[i][i];
            sum2 += arr[i][arr[i].length-1-i];

        }

        return Math.abs(sum1 - sum2);
    }
}
