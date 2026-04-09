package easy;

// 83. Remove Duplicates from Sorted List


import java.util.LinkedList;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        System.out.println();
        System.out.print("Original : ");
        ListNode a = head;
        while(a != null) {
            System.out.print(a.data + " ");
            a = a.next;
        }

        System.out.print("\nRemoved and print : ");
        ListNode b = deleteDuplicates(head);
        while(b != null) {
            System.out.print(b.data + " ");
            b = b.next;
        }
    }

    static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while(current != null && current.next != null) {
            if(current.data == current.next.data ) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
