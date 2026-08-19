package companies.infrrd.arrays;

import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};

        freq(arr);
    }

    static void freq(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println(map);
    }
}
