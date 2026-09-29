package companies.ibm.Solve_This;

public class Prefix_Sum_Maximization {

    public static void main(String[] args) {

        int[] arr = {2, -1, 3, -2, 4};

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            maxSum = Math.max(maxSum, sum);
        }

        System.out.println("Maximum Prefix Sum: " + maxSum);
    }
}