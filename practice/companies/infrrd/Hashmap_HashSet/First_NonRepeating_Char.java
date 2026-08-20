package companies.infrrd.Hashmap_HashSet;

import java.util.HashMap;

public class First_NonRepeating_Char {
    public static void main(String[] args) {
        String str = "swiss";

        HashMap<Character, Integer> map = new HashMap<>();

        // Pass 1: Count characters
        for(int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        // Pass 2: Find first character with frequency 1
        for(char key : str.toCharArray()) {
            if(map.get(key) == 1) {
                System.out.println(key);
                break;
            }
        }
    }
}
