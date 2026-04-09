package medium;

// First Unique Character in a String

import java.util.Arrays;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String s = "abc";

        unique(s);
    }

    static void unique(String s) {
        char[] c = s.toCharArray();

        char uni = ' ';
        boolean found = false;

        for(int i=0; i<s.length(); i++) {
            boolean unique = true;
            for(int j=0; j<s.length(); j++) {
                if(i != j && c[i] == c[j]) {
                    unique = false;
                    break;
                }
            }

            if(unique) {
                uni = c[i];
                found = true;
                break;
            }
        }

        System.out.println(Arrays.toString(c));
        System.out.println(found ? uni : "Not Found");
    }
}
