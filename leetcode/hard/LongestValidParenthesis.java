package hard;

// Example 1:
//Input: s = "(()"
//Output: 2
//Explanation: The longest valid parentheses substring is "()".

//Example 2:
//Input: s = ")()())"
//Output: 4
//Explanation: The longest valid parentheses substring is "()()".

//Example 3:
//Input: s = ""
//Output: 0

import java.util.Stack;

public class LongestValidParenthesis {

    public static void main(String[] args) {
        String s = ")()())";

        System.out.println(longestValidParentheses(s));
    }

    static int longestValidParentheses(String s) {

        int max = 0;

        Stack<Integer> sum = new Stack<>();
        sum.add(-1);

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                sum.push(i);
            } else {
                sum.pop();

                if(sum.empty()) {
                    sum.push(i);
                } else {
                    max = Math.max(max, i - sum.peek());
                }
            }
        }

        System.out.println(sum);

        return max;
    }
}
