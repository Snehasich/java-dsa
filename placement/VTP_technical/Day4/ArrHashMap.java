package VTP_technical.Day4;

import java.util.*;

public class ArrHashMap {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,7};
        System.out.println(check(nums));
    }

    static HashMap check(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
//            if(map.containsKey(num)) {
//                map.put(num, map.get(num) + 1);
//            } else {
//                map.put(num, 1);
//            }

            map.put(num, map.getOrDefault(num, 0) + 1);         // getOrDefault(key, default)
        }

        return map;
    }
}
