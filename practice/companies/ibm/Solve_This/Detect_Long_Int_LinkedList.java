package companies.ibm.Solve_This;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Detect_Long_Int_LinkedList {

    public static void main(String[] args) {

        // Create nodes
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);

        // Connect nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Create a cycle:
        // 40 -> 20
        node4.next = node2;

        // Check whether linked list has a cycle
        boolean result = hasCycle(node1);

        System.out.println("Has cycle: " + result);
    }

    static boolean hasCycle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            // Slow moves one step
            slow = slow.next;

            // Fast moves two steps
            fast = fast.next.next;

            // If they meet, a cycle exists
            if (slow == fast) {
                return true;
            }
        }

        // Fast reached the end, so there is no cycle
        return false;
    }
}