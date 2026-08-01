package Top_75_Leetcode.LinkedList;

// https://leetcode.com/problems/odd-even-linked-list/description/?envType=study-plan-v2&envId=leetcode-75

//Example 1:
//Input: head = [1,2,3,4,5]
//Output: [1,3,5,2,4]

//Example 2
//Input: head = [2,1,3,5,6,4]
//Output: [2,3,6,7,1,5,4]


public class Odd_Even_328 {

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

        ListNode head2 = oddEvenList(head);
        printList(head2);
    }

    static ListNode oddEvenList(ListNode head) {
        // Base case: 0, 1, or 2 elements are already in valid order
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; // Save start of even list to attach later,    "evenHead is just a bookmark, It remembers where the even list starts."

        while (even != null && even.next != null) {
            // Connect odd nodes
            odd.next = even.next;
            odd = odd.next;

            // Connect even nodes
            even.next = odd.next;
            even = even.next;
        }

        // Attach even list after odd list
        odd.next = evenHead;

        return head;
    }
}
