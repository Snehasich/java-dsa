package Top_75_Leetcode;

// https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=leetcode-75

//Example 1:
//Input: s = "abc", t = "ahbgdc"
//Output: true

//Example 2:
//Input: s = "axc", t = "ahbgdc"
//Output: false



public class isSubsequence_392 {
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";

        System.out.println(isSubsequence(s, t));
    }

    static boolean isSubsequence(String s, String t) {
        int i = 0; // Pointer for s
        int j = 0; // Pointer for t

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++; // Match found, move s pointer
            }

            j++; // Always move t pointer
        }

        return i == s.length();
    }
}


