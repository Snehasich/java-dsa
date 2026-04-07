package dsa.dp;// input,  coins[] = {1,2,3}, sum = 4;
// output, 4

public class CoinChangeProblem {
    public static void main(String[] args) {
        int[] coins = {1,2,3};
        int sum = 4;

        System.out.println(coinChange(coins, sum));
    }

    static int coinChange(int[] arr, int sum) {
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            int ans = 0;
            for(int j=0; j<arr.length; j++) {
                if(arr[i] + arr[j] == sum || ans == sum) {
                    count++;
                } else {
                    ans += arr[j];
                }
            }
        }

        return count;
    }
}
