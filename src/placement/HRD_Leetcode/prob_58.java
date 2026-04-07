package HRD_Leetcode;

import java.util.Arrays;

public class prob_58 {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";

        System.out.println(lengthOfLastWord(s));;
    }

    static int lengthOfLastWord(String s) {
        if(s == null) {
            return 0;
        }

        s = s.trim();
        System.out.println(s);

        char[] rev = s.toCharArray();
        System.out.println(Arrays.toString(rev));
        int count = 0;

        for(int i=rev.length-1; i>=0; i--) {
            if(rev[i] != ' ') {
                count++;
            } else {
                break;
            }
        }

        return count;

    }
}
