package binary_tree;

public class Sum_Nodes {
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

        System.out.println(sumOfNodes(root));         // O(N)
    }

    static int sumOfNodes(Node root) {
        if(root == null) return 0;

        int leftNodes = sumOfNodes(root.left);
        int rightNodes = sumOfNodes(root.right);

        return leftNodes + rightNodes + root.data;
    }
}
