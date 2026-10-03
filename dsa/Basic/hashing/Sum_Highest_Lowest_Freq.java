package Basic.hashing;

import java.util.*;

public class Sum_Highest_Lowest_Freq {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3};

        System.out.println(sumHighestAndLowestFrequency(arr));
    }

    static int sumHighestAndLowestFrequency(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int highest = 0;
        int lowest = Integer.MAX_VALUE;

        for (int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);

        // checking highest and lowest freq
        for(var ele : map.entrySet()) {
            int key = ele.getKey();
            int freq = ele.getValue();

            if(freq > highest) {
                highest = freq;
            }

            if(freq < lowest) {
                lowest = freq;
            }
        }

        return highest + lowest;
    }
}
