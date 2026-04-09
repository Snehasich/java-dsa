package medium;

import java.util.Arrays;

public class DecodeWays {

    public static void main(String[] args) {
        String s = "06";

        System.out.println(numDecodings(s));;
    }

    static int numDecodings(String s) {

        char[] c = s.toCharArray();

        System.out.println(Arrays.toString(c));

        for(int i=0; i<s.length(); i++) {
            if(s.length() == 0) {
                return 0;
            }

            if(c[0] != 0) {
                return c.length;
            }
        }

        return 0;
    }
}
