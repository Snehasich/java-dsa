package Top_75_Leetcode;

// https://leetcode.com/problems/removing-stars-from-a-string/description/?envType=study-plan-v2&envId=leetcode-75

// Example 1:
//Input: s = "leet**cod*e"
//Output: "lecoe"
//Explanation: Performing the removals from left to right:
//- The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
//- The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
//- The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
//There are no more stars, so we return "lecoe".

//Example 2:
//Input: s = "erase*****"
//Output: ""
//Explanation: The entire string is removed, so we return an empty string.


import java.util.Stack;

public class Remove_Stars_String_2390 {
    public static void main(String[] args) {
        String s = "leet**cod*e";

        System.out.println(removeStars(s));
    }

//    static String removeStars(String s) {
//        Stack<Character> stack = new Stack<>();
//        String ans = "";
//
//        for(int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) == '*') {
//                stack.pop();
//            } else {
//                stack.push(s.charAt(i));
//            }
//        }
//
//        for(int i = 0; i < stack.size(); i++) {
//            ans += stack.get(i);
//        }
//
//        return ans;
//    }


    static String removeStars(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
