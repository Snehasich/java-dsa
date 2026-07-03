package VTP_technical.Day5;

public class DeleteNodeLL_237 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

//        System.out.println("Middle List");
//        Node check = deleteNode(head);
//        while (check != null) {
//            System.out.print(check.data + " -> ");
//            check = check.next;
//        }
//        System.out.println("null");
    }

    static void deleteNode(Node node) {
        // here it skips the target node which to delete
        node.data = node.next.data;
        node.next = node.next.next;
    }
}
