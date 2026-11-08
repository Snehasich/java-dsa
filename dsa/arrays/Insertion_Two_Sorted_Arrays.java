package arrays;

//Example 1:
//Input: nums1 = [1, 2, 2, 3, 5], nums2 = [1, 2, 7]
//Output: [1, 2]
//Explanation: The elements 1, 2 are the only elements present in both nums1 and nums2
//
//Example 2:
//Input: nums1 = [1, 2, 2, 3, 3, 3], nums2 = [2, 3, 3, 4, 5, 7]
//Output: [2, 3, 3]
//Explanation: The element 2 appears in both arrays only one time.
// The element 3 appears in both arrays two times so we add element 3 equal to its number of occurrences.


import java.util.ArrayList;
import java.util.Arrays;

public class Insertion_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 3, 3}, nums2 = {2, 3, 3, 4, 5, 7};

        System.out.println(Arrays.toString(intersectionArray(nums1, nums2)));
    }

    static int[] intersectionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();

        int i=0, j=0;

        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) {
                list.add(nums1[i]);

                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
