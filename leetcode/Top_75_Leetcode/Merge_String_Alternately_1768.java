package Top_75_Leetcode;


// https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75

// Example 1:
//Input: word1 = "ab", word2 = "pqrs"
//Output: "apbqrs"
//Explanation: Notice that as word2 is longer, "rs" is appended to the end.
//word1:  a   b
//word2:    p   q   r   s
//merged: a p b q   r   s

//Example 2:
//Input: word1 = "abcd", word2 = "pq"
//Output: "apbqcd"
//Explanation: Notice that as word1 is longer, "cd" is appended to the end.
//word1:  a   b   c   d
//word2:    p   q
//merged: a p b q c   d



public class Merge_String_Alternately_1768 {
    public static void main(String[] args) {
        String word1 = "ab", word2 = "pqrs";

        System.out.println(mergeAlternately(word1, word2));
    }

    static String mergeAlternately(String word1, String word2) {
        StringBuffer sb = new StringBuffer();

        int max = Math.max(word1.length(), word2.length());

        for(int i = 0; i < max; i++) {
            if(i < word1.length()) {
                sb.append(word1.charAt(i));
            }

            if(i < word2.length()) {
                sb.append(word2.charAt(i));
            }
        }

        return sb.toString();
    }
}
