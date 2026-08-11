package linked_list;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    // insert using Recursion
    public void recursionInsert(int val, int index) {
        head = recursionInsert(val, index, head);
    }

    private Node recursionInsert(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = recursionInsert(val, index - 1, node.next);
        return node;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertEnd(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;


        size++;
    }

    public void insertIndex(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertEnd(val);
            return;
        }

        // 10 20 40 50 60
        // add 30 in index 2

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;

        return val;
    }

    public Node get(int index) {
        Node val = head;
        for (int i = 0; i < index; i++) {
            val = val.next;
        }
        return val;
    }

    public int deleteIndex(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


    // QUESTIONS

    public void duplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }

        tail = node;
        tail.next = null;
    }

    public static LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertEnd(f.value);
                f = f.next;
            } else {
                ans.insertEnd(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertEnd(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.insertEnd(s.value);
            s = s.next;
        }

        return ans;
    }

    private void bubblesort(int row, int col) {
        if(row == 0) {
            return;
        }

        if(row < col) {
            Node first = get(col);
            Node second = get(col + 1);

            if(first.value > second.value) {
                // swap
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = tail;
                } else if(second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }

            bubblesort(row, col+1);
        } else {
            bubblesort(row-1, 0);
        }
    }


    // reverse
    private void reverse(Node node) {
        if(node == tail) {
            head = tail;
            return;
        }

        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }


    public static void main(String[] args) {
//        LL list = new LL();
//
//        list.insertEnd(1);
//        list.insertEnd(1);
//        list.insertEnd(2);
//        list.insertEnd(3);
//        list.insertEnd(3);
//        list.insertEnd(3);
//
//        list.display();
//        System.out.println();
//        list.duplicates();
//        list.display();
        LL first = new LL();
        LL second = new LL();

        first.insertEnd(1);
        first.insertEnd(3);
        first.insertEnd(5);

        second.insertEnd(1);
        second.insertEnd(2);
        second.insertEnd(9);
        second.insertEnd(14);

        LL ans = LL.merge(first, second);
        ans.display();

    }
}