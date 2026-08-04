package Top_75_Leetcode.BinaryTree_DFS;

// https://leetcode.com/problems/leaf-similar-trees/description/?envType=study-plan-v2&envId=leetcode-75

//Example 1:
//Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
//Output: true

//Example 2:
//Input: root1 = [1,2,3], root2 = [1,3,2]
//Output: false


import java.util.*;

public class Leaf_Similar_Tree_872 {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);

        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);
        root1.right.left = new TreeNode(9);
        root1.right.right = new TreeNode(8);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);


        // ROOT 2
        TreeNode root2 = new TreeNode(3);

        root2.left = new TreeNode(5);
        root2.right = new TreeNode(1);
        root2.left.left = new TreeNode(6);
        root2.left.right = new TreeNode(7);
        root2.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(2);
        root2.right.right.left = new TreeNode(9);
        root2.right.right.right = new TreeNode(8);


        System.out.println(leafSimilar(root1, root2));
    }

    static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        getLeaves(root1, list1);
        getLeaves(root2, list2);

        return list1.equals(list2);
    }

    static void getLeaves(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }

        getLeaves(root.left, list);
        getLeaves(root.right, list);
    }
}