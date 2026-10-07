package Basic.strings;

// https://leetcode.com/problems/valid-anagram/description/

//Example 1:
//Input: s = "anagram", t = "nagaram"
//Output: true

//Example 2:
//Input: s = "rat", t = "car"
//Output: false


import java.util.Arrays;

public class Valid_Anagram_242 {
    public static void main(String[] args) {
        String s = "rat", t = "car";

        System.out.println(isAnagram(s,t));
    }

    static boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        if(s.length() != t.length()) return false;

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0; i<s.length(); i++) {
            if(a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}
