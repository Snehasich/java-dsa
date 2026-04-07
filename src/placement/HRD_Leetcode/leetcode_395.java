package placement.HRD_Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class leetcode_395 {

    public static void main(String[] args) {
        String s = "aaabb";
        int k = 3;

        System.out.println(helper(s,k));
    }

    static int helper(String s, int k) {
        // Base case
        if (s.length() == 0) return 0;

        // Step 1: Count frequency
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Step 2: Check for bad character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] < k) {
                // Step 3: Split and recurse
                int left = helper(s.substring(0, i), k);
                int right = helper(s.substring(i + 1), k);

                return Math.max(left, right);
            }
        }

        // Step 4: All characters valid
        return s.length();
    }

}
