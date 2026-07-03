package VTP_technical.Day5;

public class RemoveDuplicatesLL_83 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Remove Duplicates List");
        Node check = removeDuplicate(head);
        while (check != null) {
            System.out.print(check.data + " -> ");
            check = check.next;
        }
        System.out.println("null");
    }

    static Node removeDuplicate(Node head) {
        if (head == null) return null;

        Node node = head;

        while (node.next != null) {
            if (node.data == node.next.data) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }

        return head;
    }
}
