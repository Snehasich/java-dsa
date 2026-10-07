package Basic.strings;

// https://leetcode.com/problems/rotate-string/description/

//Example 1:
//Input: s = "abcde", goal = "cdeab"
//Output: true
//Explanation: Rotating s to the left by 2 positions moves "ab" to the end, resulting in "cdeab", which is equal to goal.

//Example 2:
//Input: s = "abcde", goal = "abced"
//Output: false
//Explanation: No sequence of rotations of s can produce "abced". The characters appear in a different relative order, so goal is not a rotation of s.


import java.util.Arrays;

public class Rotate_String_796 {
    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";

        System.out.println(rotateString(s,goal));
    }

    static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;

        String newStr = s + s;

        return newStr.contains(goal);
    }
}
