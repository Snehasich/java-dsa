package VTP_technical.Day6;


public class LLCycle_141 {
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(-4);

        System.out.println("Has Cycle Linked List");
        System.out.println(hasCycle(head));
    }

    static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null &&  fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {      // compare address of this, this is objects
                return true;
            }
        }

        return false;
    }
}
