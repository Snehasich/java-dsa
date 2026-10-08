package Basic.strings;

// https://leetcode.com/problems/sort-characters-by-frequency/description/

//Example 1:
//Input: s = "tree"
//Output: "eert"
//Explanation: 'e' appears twice while 'r' and 't' both appear once.
//So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

//Example 2:
//Input: s = "cccaaa"
//Output: "aaaccc"
//Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.

//Example 3:
//Input: s = "Aabb"
//Output: "bbAa"
//Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.


import java.util.HashMap;

public class Sort_Char_By_Frequency_451 {
    public static void main(String[] args) {
        String s = "tree";

        System.out.println(frequencySort(s));
    }

//    static String frequencySort(String s) {
//        StringBuilder ans = new StringBuilder();
//
//        for(int maxCount = s.length(); maxCount>=1; maxCount--) {
//            for (int i = 0; i < s.length(); i++) {
//                int count = 0;
//                for (int j = 0; j < s.length(); j++) {
//                    if (s.charAt(j) == s.charAt(i)) {
//                        count++;
//                    }
//                }
//
//                // Don't process same character again
//                if (ans.indexOf(String.valueOf(s.charAt(i))) != -1) {
//                    continue;
//                }
//
//                if (count == maxCount) {
//                    for (int j = 0; j < count; j++) {
//                        ans.append(s.charAt(i));
//                    }
//                }
//
//                System.out.println(s.charAt(i) + " -> " + count);
//            }
//        }
//
//        return ans.toString();
//    }


    static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // get the max value
        int max = 0;

        for (int value : map.values()) {
            if (value > max) {
                max = value;
            }
        }

        // check and store it
        int current = max;
        while(current > 0) {
            for (var ch : map.entrySet()) {
                char key = ch.getKey();
                int value = ch.getValue();

                if (value == current) {
                    for (int i = 0; i < value; i++) {
                        ans.append(key);
                    }
                }
            }
            current--;
        }


        return ans.toString();
    }
}
