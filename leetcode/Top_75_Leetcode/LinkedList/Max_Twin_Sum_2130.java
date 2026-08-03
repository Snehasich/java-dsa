package Top_75_Leetcode.LinkedList;

// https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/?envType=study-plan-v2&envId=leetcode-75

//Example 1:
//Input: head = [5,4,2,1]
//Output: 6
//Explanation:
//Nodes 0 and 1 are the twins of nodes 3 and 2, respectively. All have twin sum = 6.
//There are no other nodes with twins in the linked list.
//Thus, the maximum twin sum of the linked list is 6.

//Example 2:
//Input: head = [4,2,2,3]
//Output: 7
//Explanation:
//The nodes with twins present in this linked list are:
//- Node 0 is the twin of node 3 having a twin sum of 4 + 3 = 7.
//- Node 1 is the twin of node 2 having a twin sum of 2 + 2 = 4.
//Thus, the maximum twin sum of the linked list is max(7, 4) = 7.

//Example 3:
//Input: head = [1,100000]
//Output: 100001
//Explanation:
//There is only one node with a twin in the linked list having twin sum of 1 + 100000 = 100001.


import java.util.ArrayList;
import java.util.Arrays;

public class Max_Twin_Sum_2130 {
    static void printList(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println("Original List:");
        printList(head);

        int ans = pairSum(head);

        System.out.println("Maximum Twin Sum = " + ans);
    }

//    static int pairSum(ListNode head) {
//        int ans = 0;
//
//        ArrayList<Integer> arr = new ArrayList<>();
//
//        // store in arr
//        ListNode temp = head;
//        while (temp != null) {
//            arr.add(temp.data);
//            temp = temp.next;
//        }
//        System.out.println(Arrays.toString(arr.toArray()));
//
//        // finding the maximum sum
//        for(int i = 0; i < arr.size(); i++) {
//            int sum = arr.get(i) + arr.get(arr.size() - 1 - i);
//            ans = Math.max(ans, sum);
//        }
//
//        return ans;
//    }

    static int pairSum(ListNode head) {

        // Step 1: Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode prev = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // Step 3: Find maximum twin sum
        int max = 0;
        ListNode first = head;
        ListNode second = prev;

        while (second != null) {
            max = Math.max(max, first.data + second.data);
            first = first.next;
            second = second.next;
        }

        return max;
    }
}
