package placement.HRD_Leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutive {

    public static void main(String[] args) {
        int[] s = {100,4,200,1,3,2};

        System.out.println(longestConsecutive(s));
        System.out.println(longestConsecutive2(s));
    }

    static int longestConsecutive(int[] arr) {
        Arrays.sort(arr);

        int count = 0;

        if(arr.length == 1) {
            return 1;
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] <= arr[j]) {
                    count++;

                    if(arr[i] == arr[j]) {
                        count++;
                    }

                    break;
                }
            }
        }

        return count;
    }

    static int longestConsecutive2(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        int count = 1;

        for(int a : arr) {
            set.add(a);
        }

        for(int a : arr) {
            if(!set.contains(a - 1)) {
                count++;
            }
        }

        System.out.println(set);

        return count;
    }
}