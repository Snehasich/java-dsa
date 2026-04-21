package medium;

// https://leetcode.com/problems/reverse-linked-list-ii/
// 92. Reverse Linked List II


// Example 1:
//Input: head = [1,2,3,4,5], left = 2, right = 4
//Output: [1,4,3,2,5]

//Example 2:
//Input: head = [5], left = 1, right = 1
//Output: [5]

public class ReverseLink2 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode l = dummy;
        for (int i = 1; i < left; i++) l = l.next;

        ListNode r = l.next;

        for (int i = 0; i < right - left; i++) {
            ListNode temp = r.next;
            r.next = temp.next;
            temp.next = l.next;
            l.next = temp;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = reverseBetween(head, 2, 4);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}