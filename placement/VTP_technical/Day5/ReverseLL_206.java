package VTP_technical.Day5;

public class ReverseLL_206 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Reverse List");
        Node check = reverseList(head);
        while (check != null) {
            System.out.print(check.data + " -> ");
            check = check.next;
        }
        System.out.println("null");
    }

    static Node reverseList(Node head) {
        Node prev = null, curr = head, next;

        // first break it, then join it opposite
        // next will go forward
        // prev <-- curr <-- next

        // 1 --> 2 --> 3 --> 4

        while (curr != null) {
            next = curr.next;   // naxt = 2, 3
            curr.next = prev;   //  null  <--  1  <-- 2

            prev = curr;        // prev = 1, 2
            curr = next;        // curr = 2, 3
        }

        return prev;
    }
}

