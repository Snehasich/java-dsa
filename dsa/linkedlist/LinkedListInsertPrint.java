package dsa.linkedlist;

// Task: Create Node class and LinkedList class with insertAtEnd(), printList().

//public class LinkedListInsertPrint {
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    public static void main(String[] args) {
//        Node first = new Node(5);
//        Node second = new Node(6);
//        Node third = new Node(7);
//
//        // insert
//        first.next = second;
//        first.next.next = third;
//
//        insertAtEnd(third, 100);
//
//        System.out.print("\nPrint : ");
//        printList(first);
//
//    }
//
//    static Node insertAtEnd(Node data) {
//
//        Node n = new Node(100);
//        data.next = n;
//
//        return data;
//    }
//
//    static Node printList(Node data) {
//        // traverse
//        Node temp = data;
//        while(temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        return temp;
//    }
//}


public class LinkedListInsertPrint {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;   // head stored inside LinkedList
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedListInsertPrint list = new LinkedListInsertPrint();
        list.insertAtEnd(5);
        list.insertAtEnd(71);
        list.insertAtEnd(6);
        list.insertAtEnd(45);
        list.printList();
    }
}
