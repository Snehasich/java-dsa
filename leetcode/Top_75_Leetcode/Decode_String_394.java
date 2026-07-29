package Top_75_Leetcode;

// https://leetcode.com/problems/decode-string/description/?envType=study-plan-v2&envId=leetcode-75

//Example 1:
//Input: s = "3[a]2[bc]"
//Output: "aaabcbc"

//Example 2:
//Input: s = "3[a2[c]]"
//Output: "accaccacc"

//Example 3:
//Input: s = "2[abc]3[cd]ef"
//Output: "abcabccdcdcdef"


import java.util.Stack;

public class Decode_String_394 {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";

        System.out.println(decodeString(s));
    }

    static String decodeString(String s) {
        Stack<Integer> numbers = new Stack<>();
        Stack<StringBuilder> letters = new Stack<>();

        StringBuilder number = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for(int i =0; i<s.length();i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                number.append(c);
            }
            else if(c=='['){
                numbers.push(Integer.parseInt(number.toString()));
                number.setLength(0);
                letters.push(word);
                word = new StringBuilder();
            }
            else if (c == ']'){
                int times = numbers.pop();
                word = letters.pop().append(word.toString().repeat(times));
            }
            else {
                word.append(c);
            }
        }
        return word.toString();
    }
}
