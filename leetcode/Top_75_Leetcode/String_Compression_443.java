package Top_75_Leetcode;

// https://leetcode.com/problems/string-compression/description/?envType=study-plan-v2&envId=leetcode-75


// Example 1:
//
//Input: chars = ["a","a","b","b","c","c","c"]
//Output: 6
//Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
//After modifying the input array in-place, the first 6 characters of chars should be ["a","2","b","2","c","3"].

//Example 2:
//Input: chars = ["a"]
//Output: 1

//Example 3:
//Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
//Output: 4


import java.util.HashSet;

public class String_Compression_443 {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};

        System.out.println(compress(chars));
    }

    static int compress(char[] chars) {
        int write = 0; // Position to write compressed characters
        int read = 0;  // Position to read characters

        while (read < chars.length) {
            char current = chars[read];
            int count = 0;

            // Count consecutive occurrences
            while (read < chars.length && chars[read] == current) {
                read++;
                count++;
            }

            // Write the character
            chars[write++] = current;

            // Write the count if greater than 1
            if (count > 1) {
                String cnt = String.valueOf(count);
                for (char c : cnt.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}
