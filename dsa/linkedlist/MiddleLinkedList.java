package dsa.linkedlist;

// Middle of the Linked List – LeetCode 876

public class MiddleLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(5);
        Node n2 = new Node(9);
        Node n3 = new Node(7);
        Node n4 = new Node(10);
        Node n5 = new Node(1);

        // insert
//        n1.next=n2;
//        n2.next=n3;
//        n3.next=n4;
//        n4.next=n5;

        n1.next = n2;
        n1.next.next = n3;
        n1.next.next.next = n4;
        n1.next.next.next.next = n5;


        // print
        Node temp = n1;
        System.out.print("Element : ");
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();


        System.out.println(middleNode(n1).data);
    }

    static Node middleNode(Node head) {

        int count = 0;

        Node temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }

        int n = 0;

        Node temp2 = head;
        while(temp2 != null) {

            if(n == (count / 2)) {
//                System.out.println(temp2.data);
                return temp2;
            }
            temp2 = temp2.next;
            n++;
        }

        return temp2;
    }
}
