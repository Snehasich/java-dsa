package easy;

// Leetcode 387. First Unique Character in a String


// Example 1:
//Input: s = "leetcode"
//Output: 0
//Explanation:
//The character 'l' at index 0 is the first character that does not occur at any other index.

//Example 2:
//Input: s = "loveleetcode"
//Output: 2

//Example 3:
//Input: s = "aabb"
//Output: -1

import java.util.*;

public class FirstUniqueCharacterString {
    public static void main(String[] args) {
        String s = "loveleetcode";

        System.out.println(firstUniqChar(s));
//        System.out.println(firstUniqChar2(s));
    }

    static int firstUniqChar(String s) {
        Queue<Character> queue = new PriorityQueue<>();

        for(int i=0; i<s.length(); i++) {
            queue.offer(s.charAt(i));
            char c = queue.peek();
            System.out.println("-> " + queue);

            for(char ch : queue) {
                if(!queue.contains(c)) {
                    System.out.println("* " + queue);
                    return ch;
                }
            }

        }

        return -1;
    }

//    static int firstUniqChar2(String s) {
//        int[] freq = new int[26];
//
//        for(int i=0; i<s.length(); i++) {
//            freq[s.charAt(i) - 'a']++;
//        }
//
//        for(int i=0; i<s.length(); i++) {
//            if(freq[s.charAt(i) - 'a'] == 1) {
//                return i;
//            }
//        }
//
//        return -1;
//    }
}