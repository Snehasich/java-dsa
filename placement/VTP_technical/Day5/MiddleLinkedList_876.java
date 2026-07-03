package VTP_technical.Day5;

public class MiddleLinkedList_876 {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

//        System.out.println("Original List");
//        while(head != null) {
//            System.out.print(head.data + " -> ");
//            head = head.next;
//        }
//        System.out.println();

        System.out.println("Middle List");
        Node check = middleNode(head);
        while (check != null) {
            System.out.print(check.data + " -> ");
            check = check.next;
        }
        System.out.println("null");
    }

    static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (slow != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}