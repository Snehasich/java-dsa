package Basic.hashing;

import java.util.HashMap;

public class Highest_Element {
    public static void main(String[] args) {
        int[] arr = {4, 4, 5, 5, 6};

        System.out.println(mostFrequentElement(arr));
    }

    static int mostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);

        int max = 0, ans = Integer.MAX_VALUE;

        for (var e : map.entrySet()) {
            int key = e.getKey();
            int freq = e.getValue();

            if(freq > max) {
                max = freq;
                ans = key;
            } else if(max == freq) {
                ans = Math.min(ans, key);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
