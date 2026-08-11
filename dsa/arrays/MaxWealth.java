package arrays;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] account = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        MaxWealth max = new MaxWealth();
        int ans = max.maximumWidth(account);
        System.out.println(ans);
    }

    private int maximumWidth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
