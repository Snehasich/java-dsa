package companies.infrrd.Hashmap_HashSet;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int needed = target - arr[i];

            if (map.containsKey(needed)) {
                System.out.println(needed + " + " + arr[i] + " = " + target);
                break;
            }

            map.put(arr[i], i);
        }
    }
}