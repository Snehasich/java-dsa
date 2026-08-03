package Top_75_Leetcode.BinaryTree_DFS;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Max_Depth {
    public static void main(String[] args) {

        /*
                 3
               /   \
              9     20
                   /  \
                  15   7

            Max Depth = 3
         */

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Max_Depth obj = new Max_Depth();

        System.out.println("Maximum Depth = " + obj.maxDepth(root));
    }

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}