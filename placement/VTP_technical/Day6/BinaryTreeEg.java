package VTP_technical.Day6;

public class BinaryTreeEg {
    public static void main(String[] args) {
//        TreeNode head =  new TreeNode(1);
//        head.left = new TreeNode(2);
//        head.right = new TreeNode(3);
//        head.left.left = new TreeNode(4);
//        head.left.right = new TreeNode(5);
//        head.right.right = new TreeNode(6);

        TreeNode head = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(4),
                        new TreeNode(5)
                ),
                new TreeNode(
                        3,
                        null,
                        new TreeNode(6)
                )
        );




        //         1
        //       /  \
        //      2    3
        //     / \     \
        //    4   5     6

        System.out.print("inorder : ");
        inorder(head);
        System.out.println();
        System.out.print("postorder : ");
        postorder(head);
        System.out.println();
        System.out.print("preorder : ");
        preorder(head);
    }

    static void inorder(TreeNode head){
        if(head==null){
            return;
        }

        inorder(head.left);
        System.out.print(head.data + " ");
        inorder(head.right);
    }

    static void preorder(TreeNode head){
        if(head==null){
            return;
        }

        System.out.print(head.data + " ");
        preorder(head.left);
        preorder(head.right);
    }

    static void postorder(TreeNode head){
        if(head==null){
            return;
        }

        postorder(head.left);
        postorder(head.right);
        System.out.print(head.data + " ");
    }
}
