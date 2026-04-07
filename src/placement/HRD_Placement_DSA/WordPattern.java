package placement.HRD_Placement_DSA;

import java.util.*;

public class WordPattern {

    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";

        System.out.println(wordPattern(pattern, s));
    }

    static boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();

        String[] words = s.split(" ");


        if (pattern.length() != words.length) {
            return false;
        }

        for(int i=0; i<words.length; i++) {
            String word = words[i];

            if(map.containsKey(pattern.charAt(i))) {
                if(!map.get(pattern.charAt(i)).equals(word)) {
                    return false;
                }
            } else {
                if(map.containsValue(word)) {
                    return false;
                }
                map.put(pattern.charAt(i), word);
            }
            map.put(pattern.charAt(i), words[i]);
        }

        System.out.println(Arrays.toString(words));

        System.out.println(map);

        return true;
    }
}
