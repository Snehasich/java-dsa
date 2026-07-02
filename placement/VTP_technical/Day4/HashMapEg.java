package VTP_technical.Day4;

import java.util.*;

public class HashMapEg {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Milk");
        map.put(2, "Bread");
        map.put(3, "Potato");
        map.put(4, "Cheese");
        map.put(5, "Potato");

        System.out.println(map.get(1));         // Get the value for a key

        for (Map.Entry<Integer, String> entry : map.entrySet()) {       // map.entrySet() -> all key-value pairs.
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}




