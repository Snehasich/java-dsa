package medium;

// 39. Combination Sum


//Input: candidates = [2,3,5], target = 8
//Output: [[2,2,2,2],[2,3,3],[3,5]]

//Input: candidates = [2,3,6,7], target = 7
//Output: [[2,2,3],[7]]
//Explanation:
//2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
//7 is a candidate, and 7 = 7.
//These are the only two combinations.

import java.util.*;

// include multiple times of i, so it is fixed no change

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;

        System.out.println(combinationSum(candidates, target));
    }

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    static void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        // base case
        if(target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i=start; i<candidates.length; i++) {

            // skips if the number is more than the target element
            if(candidates[i] > target) continue;

            // add in current combination
            current.add(candidates[i]);

            // reduce the target and explore more using recursion, use i because reuse the same number
            backtrack(candidates, target - candidates[i], i, current, result);


            current.remove(current.size() - 1);

        }
    }
}
