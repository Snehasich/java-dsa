package Top_75_Leetcode;

// https://leetcode.com/problems/find-the-difference-of-two-arrays/description/?envType=study-plan-v2&envId=leetcode-75

//Example 1:
//Input: nums1 = [1,2,3], nums2 = [2,4,6]
//Output: [[1,3],[4,6]]
//Explanation:
//For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
//For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums1. Therefore, answer[1] = [4,6].

//Example 2:
//Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
//Output: [[3],[]]
//Explanation:
//For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
//Every integer in nums2 is present in nums1. Therefore, answer[1] = [].


import java.util.*;

public class Find_DIff_2Arr_2215 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3}, nums2 = {2,4,6};

        System.out.println(findDifference(nums1, nums2));
    }

//    static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
//        List<List<Integer>> ans = new ArrayList<>();
//        HashSet<Integer> list1 = new HashSet<>();
//        HashSet<Integer> list2 = new HashSet<>();
//
//
//        // Elements in nums1 but not in nums2
//        for(int i = 0; i < nums1.length; i++) {
//            boolean isFound = false;
//            for(int j = 0; j < nums2.length; j++) {
//                if(nums1[i] == nums2[j]) {
//                    isFound = true;
//                    break;
//                }
//            }
//
//            if(!isFound) {
//                list1.add(nums1[i]);
//            }
//        }
//
//        // Elements in nums2 but not in nums1
//        for(int i = 0; i < nums2.length; i++) {
//            boolean isFound = false;
//            for(int j = 0; j < nums1.length; j++) {
//                if(nums2[i] == nums1[j]) {
//                    isFound = true;
//                    break;
//                }
//            }
//
//            if(!isFound) {
//                list2.add(nums2[i]);
//            }
//        }
//
//
//        ans.add(new ArrayList<>(list1));
//        ans.add(new ArrayList<>(list2));
//
//        return ans;
//    }





    static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // Store unique elements
        for(int num : nums1) {
            set1.add(num);
        }

        for(int num : nums2) {
            set2.add(num);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Elements in nums1 but not in nums2
        for(int num : set1) {
            if(!set2.contains(num)) {
                list1.add(num);
            }
        }

        // Elements in nums2 but not in nums1
        for(int num : set2) {
            if(!set1.contains(num)) {
                list2.add(num);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(list1);
        ans.add(list2);

        return ans;
    }
}