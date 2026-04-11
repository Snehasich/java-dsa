package easy;

// 21. Merge Two Sorted Lists

// Example 1:
//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]

//Example 2:
//Input: list1 = [], list2 = []
//Output: []

//Example 3:
//Input: list1 = [], list2 = [0]
//Output: [0]

class Node {
    int val;
    Node next;
    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node next) { this.val = val; this.next = next;}
}

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        // Create list1: 1 -> 2 -> 4
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);

        // Create list2: 1 -> 3 -> 4
        Node list2 = new Node(1);
        list2.next = new Node(3);
        list2.next.next = new Node(4);

        Node merged = mergeTwoLists(list1, list2);

        // Print merged list
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
    }

    static Node mergeTwoLists(Node list1, Node list2) {
        if(list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }

        if(list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
