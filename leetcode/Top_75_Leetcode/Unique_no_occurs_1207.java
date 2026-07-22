package Top_75_Leetcode;

// https://leetcode.com/problems/unique-number-of-occurrences/description/?envType=study-plan-v2&envId=leetcode-75

//Example 1:
//Input: arr = [1,2,2,1,1,3]
//Output: true
//Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

//Example 2:
//Input: arr = [1,2]
//Output: false

//Example 3:
//Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
//Output: true


import java.util.HashMap;
import java.util.HashSet;

public class Unique_no_occurs_1207 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};

        System.out.println(uniqueOccurrences(arr));
    }

    static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if(map.containsKey(i)) {
                map.put(i,map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for(int freq : map.values()) {
            if(set.contains(freq)) {
                return false;
            }
            set.add(freq);
        }

        return true;
    }
}