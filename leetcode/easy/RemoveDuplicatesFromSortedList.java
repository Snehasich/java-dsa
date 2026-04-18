package easy;

// 83. Remove Duplicates from Sorted List


public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);

        System.out.println();
        System.out.print("Original : ");
        Node a = head;
        while(a != null) {
            System.out.print(a.val + " ");
            a = a.next;
        }

        System.out.print("\nRemoved and print : ");
        Node b = deleteDuplicates(head);
        while(b != null) {
            System.out.print(b.val + " ");
            b = b.next;
        }
    }

    static Node deleteDuplicates(Node head) {
        Node current = head;
        while(current != null && current.next != null) {
            if(current.val == current.next.val ) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
