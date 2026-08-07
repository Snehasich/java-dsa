package Binary_Tree;

// Number of nodes in the longest path between any two nodes

// COMPANIES : ADOBE, SNAPDEAL


public class Diameter_Tree {
    public static void main(String[] args) {
        //        1
        //       / \
        //      2   3
        //     / \   \
        //    4   5   6

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(diameter_tree(root));         // O(N^2)

        System.out.println(diameter2(root).diam);        // O(N)
    }

    static int diameter_tree(Node root) {
        if(root == null) return 0;

        // check for left most tree
        int diam1 = diameter_tree(root.left);

        // check for right most tree
        int diam2 = diameter_tree(root.right);

        // check from left to right most tree
        int diam3 = height(root.left) + height(root.right) + 1;     // taking extra O(N)

        int max = Math.max(diam3, Math.max(diam1, diam2));

        return max;
    }

    static int height(Node root) {
        if(root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int maxHeight = Math.max(leftHeight, rightHeight) + 1;

        return maxHeight;
    }





    // method 2 -> O(N)

    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    static TreeInfo diameter2(Node root) {
        if(root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiameter = Math.max(diam1, Math.max(diam2, diam3));

        return new TreeInfo(myHeight, myDiameter);
    }
}
