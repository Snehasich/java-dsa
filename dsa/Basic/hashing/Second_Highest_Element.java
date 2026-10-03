package Basic.hashing;

import java.util.HashMap;

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
