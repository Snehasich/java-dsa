package placement.HRD_Leetcode;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Leetcode_21 {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);


        mergeTwoLists(head1, head2);

        // reverse
        System.out.println("\nReverse : ");
        ListNode rev = new ListNode(1);
        rev.next = new ListNode(2);
        rev.next.next = new ListNode(2);
        System.out.println(reverseLists(rev));


        // delete duplicates
//        System.out.println("Duplicates : ");
//        ListNode head = new ListNode(1);
//        head2.next = new ListNode(2);
//        head2.next.next = new ListNode(2);
//
//        deleteDuplicates(head);

    }

    static ListNode reverseLists(ListNode head) {
        ListNode curr = head, next, prev = null;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
                System.out.print(current.val + " ");
            } else {
                current.next = list2;
                list2 = list2.next;
                System.out.print(current.val + " ");
            }
            current = current.next;
        }

        if(list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }


    static ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while(curr != null) {
            if(head == head.next) {
                curr.next = head;
                System.out.println(curr.val + " ");
            } else {
                curr.next = head;
                System.out.println(curr.val + " ");
            }

            curr = curr.next;
        }

        return curr;
    }
}
