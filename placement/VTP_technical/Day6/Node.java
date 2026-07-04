package VTP_technical.Day6;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode() { }

    TreeNode(int data){
        this.data=data;
    }

    TreeNode(int data,TreeNode left,TreeNode right){
        this.data=data;
        this.left=left;
        this.right=right;
    }
}