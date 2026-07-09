package easy;

// https://leetcode.com/problems/minimum-depth-of-binary-tree/description/


class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode() { }

    TreeNode(int data){
        this.data=data;
    }

    TreeNode(int data, TreeNode left, TreeNode right){
        this.data=data;
        this.left=left;
        this.right=right;
    }
}


public class Min_Depth_Binary_Tree_111 {
    public static void main(String[] args) {
        //         3
        //       /   \
        //      9     20
        //           /  \
        //          15   7

        TreeNode root = new TreeNode(
                3,
                new TreeNode(9),
                new TreeNode(
                        20,
                        new TreeNode(15),
                        new TreeNode(7)
                )
        );

        System.out.println("Minimum Depth: " + minDepth(root));
    }

    static int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        if (root.left == null)
            return minDepth(root.right) + 1;

        if (root.right == null)
            return minDepth(root.left) + 1;

        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
