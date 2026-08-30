package hashing;

import java.util.HashMap;

public class basic {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,3};
        String s = "abcdabegc";

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        System.out.println(map);
    }
}
