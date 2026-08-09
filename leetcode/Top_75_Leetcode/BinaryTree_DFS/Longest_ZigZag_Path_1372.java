package Top_75_Leetcode.BinaryTree_DFS;

// https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/description/?envType=study-plan-v2&envId=leetcode-75

//Example 1:
//Input: root = [1,null,1,1,1,null,null,1,1,null,1,null,null,null,1]
//Output: 3
//Explanation: Longest ZigZag path in blue nodes (right -> left -> right).

//Example 2:
//Input: root = [1,1,1,null,1,null,null,1,1,null,1]
//Output: 4
//Explanation: Longest ZigZag path in blue nodes (left -> right -> left -> right).

//Example 3:
//Input: root = [1]
//Output: 0



public class Longest_ZigZag_Path_1372 {
    public static void main(String[] args) {

        //           1
        //           \
        //            1
        //           / \
        //          1   1
        //             / \
        //            1   1
        //             \
        //              1
        //               \
        //                1


        TreeNode root = new TreeNode(1);

        root.left = null;
        root.right = new TreeNode(1);

        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(1);

        root.right.left.left = null;
        root.right.left.right = null;

        root.right.right.left = new TreeNode(1);
        root.right.right.right = new TreeNode(1);

        root.right.right.left.left = null;
        root.right.right.left.right = new TreeNode(1);

        root.right.right.right.left = null;
        root.right.right.right.right = null;

        root.right.right.left.right.right = new TreeNode(1);


        System.out.println(longestZigZag(root));
    }

    static int max = 0;

    static int longestZigZag(TreeNode root) {
        max = 0;

        dfs(root.left, "left", 1);
        dfs(root.right, "right", 1);

        return max;
    }

    static void dfs(TreeNode root, String direction, int length) {

        if (root == null) {
            return;
        }

        max = Math.max(max, length);

        if (direction.equals("left")) {

            // LEFT -> RIGHT = continue
            dfs(root.right, "right", length + 1);

            // LEFT -> LEFT = restart
            dfs(root.left, "left", 1);

        } else {

            // RIGHT -> LEFT = continue
            dfs(root.left, "left", length + 1);

            // RIGHT -> RIGHT = restart
            dfs(root.right, "right", 1);
        }
    }
}