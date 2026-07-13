package Top_75_Leetcode;

// https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=leetcode-75

// Example 1:
//Input: s = "the sky is blue"
//Output: "blue is sky the"

//Example 2:
//Input: s = "  hello world  "
//Output: "world hello"
//Explanation: Your reversed string should not contain leading or trailing spaces.



public class Reverse_Words_151 {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    static String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");       // Split wherever there are one or more spaces.

        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);

            if(i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}