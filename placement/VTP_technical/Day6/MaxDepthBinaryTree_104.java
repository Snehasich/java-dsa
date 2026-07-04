package VTP_technical.Day6;

public class MaxDepthBinaryTree_104 {

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

        System.out.println("Maximum Depth: " + maxDepth(root));
    }

    static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}