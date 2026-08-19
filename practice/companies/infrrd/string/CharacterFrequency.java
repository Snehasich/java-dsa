package companies.infrrd.string;

import java.util.*;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "hello";

        charfreq(str);
    }

    static void charfreq(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        System.out.println(map);
    }
}
