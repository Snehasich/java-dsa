package medium;

// Leetcode 875. Koko Eating Bananas

// Example 1:
//Input: piles = [3,6,7,11], h = 8
//Output: 4

//Example 2:
//Input: piles = [30,11,23,4,20], h = 5
//Output: 30

//Example 3:
//Input: piles = [30,11,23,4,20], h = 6
//Output: 23

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;

        System.out.println(minEatingSpeed(piles, h));
    }

    static int minEatingSpeed(int[] arr, int h) {
        int start = 1;
        int end = 0;

        for(int pile : arr) {
            end = Math.max(end, pile);
        }

        int ans = end;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            long totalHours = 0;

            for(int pile : arr) {
                totalHours += (pile + mid - 1) / mid;
            }

            if(totalHours <= h) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}
