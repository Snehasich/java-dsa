package Top_75_Leetcode.BinaryTree_DFS;

// https://leetcode.com/problems/path-sum-iii/description/?envType=study-plan-v2&envId=leetcode-75

//Example 1:
//Input: root = [10,5,-3,3,2,null,11,3,-2,null,1], targetSum = 8
//Output: 3
//Explanation: The paths that sum to 8 are shown.

//Example 2:
//Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
//Output: 3


import java.util.*;

public class Path_Sum_3_437 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.right.right = new TreeNode(11);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.left.right.right = new TreeNode(1);


        int targetSum = 8;

        System.out.println(pathSum(root, targetSum));
    }

//    static int pathSum(TreeNode root, int targetSum) {
//        if(root == null) return 0;
//
//        // Visits every node in the tree
//        return sum(root, (long) targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
//    }
//
//    static int sum(TreeNode root, long targetSum) {
//        if(root == null) return 0;
//
//        int count = 0;
//
//        if(root.val == targetSum) {
//            count = 1;
//        }
//
//        count += sum(root.left, targetSum - root.val);
//        count += sum(root.right, targetSum - root.val);
//
//        return count;
//    }


    // Optimize one

    static HashMap<Long, Integer> map = new HashMap<>();

    static int pathSum(TreeNode root, int targetSum) {
        map.put(0L, 1);
        return dfs(root, 0L, targetSum);
    }

    static int dfs(TreeNode root, long currentSum, int targetSum) {

        if (root == null) return 0;

        currentSum += root.val;
        int count = map.getOrDefault(currentSum - targetSum, 0);

        map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);

        count += dfs(root.left, currentSum, targetSum);
        count += dfs(root.right, currentSum, targetSum);

        map.put(currentSum, map.get(currentSum) - 1);

        return count;
    }
}
