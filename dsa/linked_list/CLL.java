package linked_list;

public class CLL {

    private ListNode head;
    private ListNode tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        ListNode node = new ListNode(val);

        if(head == null) {
            head = tail = node;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val) {
        ListNode node = head;
        if(node == null) {
            return;
        }

        if(node.val == val) {
            head = head.next;
            tail.next = head;
        }

        do {
            ListNode n = node.next;
            if(n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }

    public void display() {
        ListNode node = head;

        if(head != null) {
            do {
                System.out.print(node.val + " -> ");
                node = node.next;
            } while (node != head);
            System.out.print("HEAD");
        }
    }


    // length of cycle
    // https://leetcode.com/problems/linked-list-cycle/
    public int lengthCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // 1 step
            fast = fast.next.next;     // 2 steps

            if (slow == fast) {
                ListNode temp = slow;
                int length = 0;

                do {
                    temp = temp.next;
                    length += 1;
                } while(temp != fast);

                return length;
            }
        }

        return 0; // no cycle
    }


    // https://leetcode.com/problems/linked-list-cycle-ii/
    public ListNode detectCycle(ListNode head) {
        int length = 0;

        // find the cycle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // 1 step
            fast = fast.next.next;     // 2 steps

            if (slow == fast) {
                length = lengthCycle(slow);
                break;
            }
        }

        if(length == 0) {
            return null;
        }


        // find the start node
        ListNode f = head;
        ListNode s = head;

        while(length > 0) {
            s = s.next;
            length--;
        }

        // keep moving both forward and they will meet at cycle start
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    private class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
