package arrays;

// GOOGLE

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class FindAllMissing {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};     // ans is [5,6]
        findDisappearedNumbers(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(findDisappearedNumbersEasy(arr));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                swap(nums,i,correct);
            } else {
                i++;
            }
        }

        // just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1) {
                ans.add(index+1);
            }
        }

        return ans;
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }


    // or


    static List<Integer> findDisappearedNumbersEasy(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
}

