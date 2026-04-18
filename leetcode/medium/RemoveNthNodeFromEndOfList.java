package medium;

// Leetcode 19. Remove Nth Node From End of List


// Example 1:
//Input: head = [1,2,3,4,5], n = 2
//Output: [1,2,3,5]

//Example 2:
//Input: head = [1], n = 1
//Output: []

//Example 3:
//Input: head = [1,2], n = 1
//Output: [1]

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    @Override
    public String toString() {
        return val + (next != null ? " -> " + next : "");
    }
}

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);


        System.out.println();
        System.out.print("Original : ");
        ListNode a = head;
        while (a != null) {
            System.out.print(a.val + " ");
            a = a.next;
        }

        System.out.println();
        System.out.print("\nRemoved from end : ");
        int n = 2;
        ListNode b = removeNthFromEnd(head, n);
        while (b != null) {
            System.out.print(b.val + " ");
            b = b.next;
        }
    }

    static ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if(n == size) {
            return head.next;
        }

        int target = size - n;
        ListNode current = head;

        for(int i=1; i<target; i++) {
            current = current.next;
        }
        current.next = current.next.next;

        return head;
    }
}