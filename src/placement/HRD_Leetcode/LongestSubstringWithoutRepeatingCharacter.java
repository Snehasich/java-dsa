package placement.HRD_Leetcode;

// input: abcdefabc
// output: abcdef

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String s = "abacdefgabc";

        System.out.println("LongestSubstringWithoutRepeatingCharacter : " + longest(s));
    }

    static int longest(String s) {

        Set<Character> set = new HashSet<>();

        char[] c = s.toCharArray();
        int max = 0;
        System.out.println(Arrays.toString(c));

        for(int i=0; i<s.length(); i++) {
            set.clear();
            int count = 0;
            for(int j=i; j<s.length(); j++) {
                if(set.contains(c[j])) {
                    break;
                } else {
                    set.add(c[j]);
                    count++;
                }
            }

            if(max < count) {
                max = count;
            }

        }

        return max-1;
    }
}
