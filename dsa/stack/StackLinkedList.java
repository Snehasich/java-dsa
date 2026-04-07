package dsa.stack;

import java.util.Stack;

public class StackLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return String.valueOf(data);
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node tail = new Node(2);

        head.next = tail;


        Node temp = head;
        System.out.print("Elements : ");
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(" ");


        Stack<Node> s = new Stack<>();


        System.out.println("Linked List into stack placed....");
        Node temp2 = head;
        while(temp2 != null) {
            s.push(temp2);
            temp2 = temp2.next;
        }

        Node insert = new Node(10);
        System.out.print("\nInsert " + insert.data + " into this : ");
        s.push(insert);
        System.out.println(s);

        System.out.print("\nDelete the Last Element : ");
        s.pop();
        System.out.println(s);

        System.out.print("\nPeek element : ");
        Node peek = s.peek();
        System.out.println(peek.data);

    }
}
