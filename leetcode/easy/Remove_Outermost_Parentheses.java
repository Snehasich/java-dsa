package easy;

// https://leetcode.com/problems/remove-outermost-parentheses/
// 1021. Remove Outermost Parentheses


// Example 1:
//Input: s = "(()())(())"
//Output: "()()()"
//Explanation:
//The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
//After removing outer parentheses of each part, this is "()()" + "()" = "()()()".

//Example 2:
//Input: s = "(()())(())(()(()))"
//Output: "()()()()(())"
//Explanation:
//The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
//After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".

//Example 3:
//Input: s = "()()"
//Output: ""
//Explanation:
//The input string is "()()", with primitive decomposition "()" + "()".
//After removing outer parentheses of each part, this is "" + "" = "".

import java.util.*;
public class Remove_Outermost_Parentheses {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }

    static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;

        for(char c : s.toCharArray()) {
            if(c == '(') {
                if(count > 0) result.append(c);
                count++;
            } else {
                count--;
                if(count > 0) result.append(c);
            }
        }

        return result.toString();
    }
}
