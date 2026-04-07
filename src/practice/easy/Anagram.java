package practice.easy;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {
        String s = "a", t = "a";

        System.out.println(isAnagram(s,t));

    }

    static boolean isAnagram(String s, String t) {

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(s.length() != t.length()) {
            return false;
        }

        for(int i=0; i<a.length; i++) {
            if(a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}
