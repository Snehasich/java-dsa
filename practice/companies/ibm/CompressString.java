package companies.ibm;

import java.util.*;

public class CompressString {
    public static void main(String[] args) {

        String s = "b2a3b4c1a2";

        System.out.println(solve(s));
    }

    static String solve(String s) {
        TreeMap<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < s.length(); i+=2) {
            char c = s.charAt(i);
            int count = s.charAt(i + 1) - '0';
            map.put(c, map.getOrDefault(c, 0) + count);
        }

        String sb = "";

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            sb += entry.getKey() + "" + entry.getValue();
        }

        return sb.toString();
    }
}
