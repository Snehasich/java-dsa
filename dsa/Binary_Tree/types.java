package Binary_Tree;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class types {
    public static void main(String[] args) {
//        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

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

        System.out.print("Original : ");
        print(root);


        System.out.print("\nPreOrder : ");      // O(N)     Root - Left - Right
        preorder(root);

        System.out.print("\nInOrder : ");      // O(N)      Left - Root - Right
        inorder(root);

        System.out.print("\nPostOrder : ");      // O(N)      Left - Root - Right
        postorder(root);
    }

    static void print(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        print(root.left);
        print(root.right);
    }

    static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static void postorder(Node root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

}
