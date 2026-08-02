package Top_75_Leetcode.LinkedList;

// https://leetcode.com/problems/reverse-linked-list/description/?envType=study-plan-v2&envId=leetcode-75

//Example 1:
//Input: head = [1,2,3,4,5]
//Output: [5,4,3,2,1]

//Example 2:
//Input: head = [1,2]
//Output: [2,1]

//Example 3:
//Input: head = []
//Output: []

public class Reverse_206 {

    static void printList(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        printList(head);

        ListNode reversed = reverseList(head);
        printList(reversed);
    }

    static ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head, next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }
}
