package easy;

// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
// 1047. Remove All Adjacent Duplicates In String


//Example 1:
//Input: s = "abbaca"
//Output: "ca"
//Explanation:
//For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".

//Example 2:
//Input: s = "azxxzy"
//Output: "ay"


public class Remove_All_Adjacent_Duplicates_In_String {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }

    static String removeDuplicates(String s) {
        char[] stack = new char[s.length()];
        int i=0;

        for(char c : s.toCharArray()) {
            if(i > 0 && stack[i-1] == c) {
                i--;
            } else {
                stack[i] = c;
                i += 1;
            }
        }

        return new String(stack, 0, i);
    }
}
