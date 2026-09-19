package companies.ibm;

// https://leetcode.com/problems/binary-tree-maximum-path-sum/description/

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Binary_Tree_Max_Path_Sum_124 {

    static int maxSum = Integer.MIN_VALUE;

    public static void main(String[] args) {

        /*
                -10
                /  \
               9    20
                   /  \
                  15   7
        */

        TreeNode root = new TreeNode(-10);

        root.left = new TreeNode(9);

        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(maxPathSum(root));
    }

    static int maxPathSum(TreeNode root) {

        maxGain(root);

        return maxSum;
    }

    static int maxGain(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftsum = Math.max(0, maxGain(root.left));
        int rightsum = Math.max(0, maxGain(root.right));

        // Left + Root + Right
        int currentPath = leftsum + rightsum + root.val;

        // Store the maximum path found
        maxSum = Math.max(maxSum, currentPath);

        // Return only one side to the parent
        return root.val + Math.max(leftsum, rightsum);
    }
}