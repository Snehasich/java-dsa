package placement.HRD_Leetcode;

// Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

//Example 1:
//Input: n = 3
//Output: ["((()))","(()())","(())()","()(())","()()()"]

//Example 2:
//Input: n = 1
//Output: ["()"]


import java.util.*;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n = 3;

        System.out.println(generateParenthesis(n));
    }

    static List<String> generateParenthesis(int n) {

        List<String> res = new ArrayList<>();

        helper(res, n, 0, 0, "");

        return res;
    }

    static void helper(List<String> res, int n, int open, int close, String s) {

        // base cond
        if(s.length() == 2 * n) {
            res.add(s);
            return;
        }

        if(open < n) {
            helper(res, n, open + 1, close, s + "(");
        }

        if(close < open) {
            helper(res, n, open, close + 1, s + ")");
        }
    }

}
