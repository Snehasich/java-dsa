package easy;

// 141. Linked List Cycle

// Example 1:
//Input: head = [3,2,0,-4], pos = 1
//Output: true
//Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

//Example 2:
//Input: head = [1,2], pos = 0
//Output: true
//Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

//Example 3:
//Input: head = [1], pos = -1
//Output: false
//Explanation: There is no cycle in the linked list.

class ListNode4 {
    int val;
    ListNode4 next;
    ListNode4(int x) {
        val = x;
        next = null;
    }
}


public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode4 head = new ListNode4(1);
        head.next = new ListNode4(2);
        head.next.next = new ListNode4(4);
        head.next.next.next = head.next;

        System.out.println(hasCycle(head));
    }

    static boolean hasCycle(ListNode4 head) {
        if (head == null) return false;

        ListNode4 slow = head;
        ListNode4 fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // 1 step
            fast = fast.next.next;     // 2 steps

            if (slow == fast) {
                return true;           // cycle detected
            }
        }

        return false; // no cycle
    }
}