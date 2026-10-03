package Basic.hashing;

import java.util.*;

//Example 1:
//Input: arr = [1, 2, 2, 3, 3, 3]
//Output: 2
//Explanation: The number 2 appears the second most (2 times) and number 3 appears the most(3 times).

//Example 2:
//Input: arr = [4, 4, 5, 5, 6, 7]
//Output: 6
//Explanation: Both 6 and 7 appear second most times, but 6 is smaller.



public class Second_Highest_Element {
    public static void main(String[] args) {
        int[] arr = {4, 4, 5, 5, 6, 7};

        System.out.println(secondMostFrequentElement(arr));
    }

    static int secondMostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);

        int max = 0, second = 0, ans = Integer.MAX_VALUE;

        // find the highest frequency
        for (int freq : map.values()) {
            max = Math.max(max, freq);
        }

        // find second highest
        for (var e : map.entrySet()) {
            int key = e.getKey();
            int freq = e.getValue();

            if (freq < max && freq > second) {
                second = freq;
                ans = key;
            } else if (freq == second) {
                ans = Math.min(ans, key);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
