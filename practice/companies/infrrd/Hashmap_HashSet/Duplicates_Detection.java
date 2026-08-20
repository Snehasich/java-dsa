package companies.infrrd.Hashmap_HashSet;

import java.util.*;

public class Duplicates_Detection {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1};

        HashSet<Integer> hash = new HashSet<>();

        for(int ans : arr) {
            if(!hash.contains(ans)) {
                hash.add(ans);
            } else {
                System.out.println("Duplicates : " + ans);
            }
        }
    }
}
