package DSA_PRAC.Queue;

// Queue Basics
// Concept: FIFO structure, enqueue/dequeue using array.
// Problem: Queue Implementation – GFG
// Goal: Learn queue mechanics.

public class basic {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();

        obj.push(10);
        obj.push(20);
        obj.push(30);

        int param_1 = obj.pop();   // 10
        int param_2 = obj.top();   // 20
        boolean param_3 = obj.empty(); // false

        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);
    }
}

class MyQueue {
    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;

    public MyQueue() {
        capacity = 1000;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void push(int x) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    public int pop() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed = arr[front];
        front = (front + 1) % capacity;
        size--;
        return removed;
    }

    public int top() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public boolean empty() {
        return size == 0;
    }
}

class check {
    int[] arr;
    int front;
    int rear;
    int capacity;
    int size;

    public check() {
        capacity = 1000;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    private void add(int x) {
        if (size == capacity) {
            System.out.println("Queue is Full");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    private int remove() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        int res = arr[front];
        front = (front + 1) % capacity;
        return res;
    }

    private int firstElement() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[front];
    }

    private boolean empty() {
        return size == 0;
    }
}


// bruth force
class MyQueue2 {
    int[] arr;
    int front;
    int rear;
    int capacity;

    public MyQueue2() {
        capacity = 1000;
        arr = new int[capacity];
        front = 0;
        rear = -1;
    }

    public void push(int x) {
        if (size() == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
    }

    public int pop() {
        if (empty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int removed = arr[front];

        if (front == rear) {
            front = 0;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        return removed;
    }

    public int top() {
        if (empty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public boolean empty() {
        return rear == -1;
    }

    public int size() {
        if (empty()) {
            return 0;
        }
        if (rear >= front) {
            return rear - front + 1;
        }
        return capacity - front + rear + 1;
    }
}
