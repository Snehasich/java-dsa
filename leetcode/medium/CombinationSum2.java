package medium;

// 40. Combination Sum II

import java.util.*;

// include single time of i, so it can change

// Handling duplicates
//Combination Sum I → no need to skip duplicates
//Combination Sum II → MUST skip duplicates


// Example 1:
//Input: candidates = [10,1,2,7,6,1,5], target = 8
//Output:
//[ [1,1,6],[1,2,5],[1,7],[2,6] ]

//Example 2:
//Input: candidates = [2,5,2,1,2], target = 5
//Output:
//[ [1,2,2], [5] ]

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;

        System.out.println(combinationSum2(candidates, target));
    }

    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(ans, new ArrayList<>(), target, candidates, 0);
        return ans;
    }

    static void helper(List<List<Integer>> ans, List<Integer> temp, int target, int[] arr, int index) {
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (target < arr[i]) break;

            if (i > index && arr[i] == arr[i - 1]) continue;

            temp.add(arr[i]);

            helper(ans, temp, target - arr[i], arr, i + 1);

            temp.remove(temp.size() - 1);
        }
    }
}
