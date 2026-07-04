package VTP_technical.Day6;

public class LLCycle_142 {
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(-4);

        System.out.println("Detect Cycle List");
        Node check = detectCycle(head);
        while (check != null) {
            System.out.print(check.data + " -> ");
            check = check.next;
        }
        System.out.println("null");
    }

    static Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                Node ptr = head;
                while(ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }

        return null;        // if no cycle then return null
    }
}