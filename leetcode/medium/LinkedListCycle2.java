package medium;

// https://leetcode.com/problems/linked-list-cycle-ii/description/
// 142. Linked List Cycle II


// Example 1:
//Input: head = [3,2,0,-4], pos = 1
//Output: tail connects to node index 1
//Explanation: There is a cycle in the linked list, where tail connects to the second node.

//Example 2:
//Input: head = [1,2], pos = 0
//Output: tail connects to node index 0
//Explanation: There is a cycle in the linked list, where tail connects to the first node.

//Example 3:
//Input: head = [1], pos = -1
//Output: no cycle
//Explanation: There is no cycle in the linked list.


class ListNode3 {
    int val;
    ListNode3 next;

    ListNode3(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle2 {

    public ListNode3 detectCycle(ListNode3 head) {
        if (head == null || head.next == null) return null;

        ListNode3 slow = head;
        ListNode3 fast = head;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Find start of cycle
                ListNode3 ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LinkedListCycle2 obj = new LinkedListCycle2();

        // Create linked list: 3 -> 2 -> 0 -> -4
        ListNode3 head = new ListNode3(3);
        ListNode3 n1 = new ListNode3(2);
        ListNode3 n2 = new ListNode3(0);
        ListNode3 n3 = new ListNode3(-4);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;

        // Create cycle: tail connects to node index 1
        n3.next = n1;

        ListNode3 result = obj.detectCycle(head);

        if (result != null) {
            // Find index of cycle start
            int index = 0;
            ListNode3 temp = head;

            while (temp != result) {
                temp = temp.next;
                index++;
            }

            System.out.println("tail connects to node index " + index);
        } else {
            System.out.println("no cycle");
        }
    }
}