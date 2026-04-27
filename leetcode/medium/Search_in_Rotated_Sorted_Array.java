package medium;

// https://leetcode.com/problems/search-in-rotated-sorted-array/
// 33. Search in Rotated Sorted Array


//Example 1:
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4

//Example 2:
//Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1

//Example 3:
//Input: nums = [1], target = 0
//Output: -1

public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;

        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
