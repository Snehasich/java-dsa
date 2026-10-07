package Basic.strings;

// https://leetcode.com/problems/isomorphic-strings/description/

//Example 1:
//Input: s = "egg", t = "add"
//Output: true
//Explanation: The strings s and t can be made identical by:
//Mapping 'e' to 'a'.
//Mapping 'g' to 'd'.

//Example 2:
//Input: s = "f11", t = "b23"
//Output: false
//Explanation: The strings s and t can not be made identical as '1' needs to be mapped to both '2' and '3'.

//Example 3:
//Input: s = "paper", t = "title"
//Output: true


import java.util.*;

public class Isomorphic_Strings_205 {
    public static void main(String[] args) {
        String s = "egg", t = "add";

        System.out.println(isIsomorphic(s,t));
    }

    static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> st = new HashMap<>();
        HashMap<Character, Character> ts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);
            char b = t.charAt(i);

            if (st.containsKey(a) && st.get(a) != b) return false;

            if (ts.containsKey(b) && ts.get(b) != a) return false;

            st.put(a, b);
            ts.put(b, a);
        }

        return true;
    }
}
