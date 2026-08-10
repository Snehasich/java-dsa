package Top_75_Leetcode.BinaryTree_DFS;

// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/?envType=study-plan-v2&envId=leetcode-75

//Example 1:
//Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
//Output: 3
//Explanation: The LCA of nodes 5 and 1 is 3.

//Example 2:
//Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
//Output: 5
//Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.

//Example 3:
//Input: root = [1,2], p = 1, q = 2
//Output: 1



public class LowestCommonAncestor_236 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode p = root.left;        // 5
        TreeNode q = root.right;       // 1

        TreeNode answer = lowestCommonAncestor(root, p, q);

        System.out.println("LCA = " + answer.val);
    }


    static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        // if p or q is in root then no need to check others directly return root
        if(root == p || root == q) return root;

        // now go to left and right of root
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left == null) {
            return right;
        } else if(right == null) {
            return left;
        }

        return root;
    }
}