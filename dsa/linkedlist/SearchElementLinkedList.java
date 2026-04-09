package dsa.linkedlist;

// Problem: Search an element in a Linked List

public class SearchElementLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static boolean search(Node data, int target) {

        Node temp = data;
        while(temp != null) {
            if(temp.data == target) {return true;}
            temp = temp.next;
        }

        return false;
    }

    public static void main(String[] args) {

        Node n1 = new Node(5);
        Node n2 = new Node(9);
        Node n3 = new Node(7);
        Node n4 = new Node(10);
        Node n5 = new Node(1);

        int target = 6;

        // insert
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;


        // print
        Node temp = n1;
        System.out.print("Element : ");
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();


        System.out.println("Target " + target + " is exists : " + search(n1,target));
    }
}
