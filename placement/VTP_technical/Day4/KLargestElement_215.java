package VTP_technical.Day4;

import java.util.*;

// time complexity is  --> nlogn + klogn =  (k+n) log n

public class KLargestElement_215 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        System.out.println(findKthLargest(nums, k));
    }

    static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {
            p.add(num);
        }

        for(int i=0; i<k-1; i++) {
            p.poll();
        }

        return p.peek();
    }
}
