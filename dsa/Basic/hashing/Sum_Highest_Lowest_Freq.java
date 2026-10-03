package Basic.hashing;

import java.util.*;

//Example 1:
//Input: arr = [1, 2, 2, 3, 3, 3]
//Output: 4
//Explanation: The highest frequency is 3 (element 3), and the lowest frequency is 1 (element 1). Their sum is 3 + 1 = 4.

//Example 2:
//Input: arr = [4, 4, 5, 5, 6]
//Output: 3
//Explanation: The highest frequency is 2 (elements 4 and 5), and the lowest frequency is 1 (element 6). Their sum is 2 + 1 = 3.



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
