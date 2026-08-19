package companies.infrrd.arrays;

import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1};

        duplicate(arr);  // 2, 1
    }

    static void duplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr) {
            if(!set.contains(num)) {
                set.add(num);
            } else {
                System.out.print(num + " ");
            }
        }
    }
}
