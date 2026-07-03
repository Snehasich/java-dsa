package VTP_technical.Day5;

import java.util.*;

public class RemoveDuplicatesLL_82 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(5);

        System.out.println("Remove Duplicates List");
        Node check = deleteDuplicates(head);
        while (check != null) {
            System.out.print(check.data + " -> ");
            check = check.next;
        }
        System.out.println("null");
    }

    static Node deleteDuplicates(Node head) {
        if(head == null ) return null;

        Node current = head;
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        while(current != null) {
            if(current.next != null && current.data == current.next.data) {
                while(current.next != null && current.data == current.next.data) {
                    current = current.next;
                }
                prev.next = current.next;
            } else {
                prev = prev.next;
            }
            current = current.next;
        }

        return dummy.next;
    }
}
