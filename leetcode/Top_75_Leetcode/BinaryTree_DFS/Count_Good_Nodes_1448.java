package Top_75_Leetcode.BinaryTree_DFS;

// https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/?envType=study-plan-v2&envId=leetcode-75

//Example 1:
//Input: root = [3,1,4,3,null,1,5]
//Output: 4
//Explanation: Nodes in blue are good.
//Root Node (3) is always a good node.
//Node 4 -> (3,4) is the maximum value in the path starting from the root.
//Node 5 -> (3,4,5) is the maximum value in the path
//Node 3 -> (3,1,3) is the maximum value in the path.

//Example 2:
//Input: root = [3,3,null,4,2]
//Output: 3
//Explanation: Node 2 -> (3, 3, 2) is not good, because "3" is higher than it.

//Example 3:
//Input: root = [1]
//Output: 1
//Explanation: Root is considered as good.


import java.util.ArrayList;

public class Count_Good_Nodes_1448 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);

        System.out.println(goodNodes(root));
    }

    static int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    static int dfs(TreeNode root, int maxSoFar) {

        if (root == null) {
            return 0;
        }

        int count = 0;

        // Current node is good
        if (root.val >= maxSoFar) {
            count = 1;
        }

        // Update maximum value seen in this path
        maxSoFar = Math.max(maxSoFar, root.val);

        // Check left and right subtree
        count += dfs(root.left, maxSoFar);
        count += dfs(root.right, maxSoFar);

        return count;
    }
}
