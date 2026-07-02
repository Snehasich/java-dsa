package VTP_technical.Day4;

import java.util.ArrayDeque;

public class ArrayDequeSTACK {
    public static void main(String[] args) {
        ArrayDeque<Integer> queueAndStack = new ArrayDeque<>();

        queueAndStack.add(67);
        queueAndStack.add(3);
        queueAndStack.add(89);
        queueAndStack.add(1);
        queueAndStack.add(223);

        System.out.println(queueAndStack);
        System.out.println(queueAndStack.peekLast());
        System.out.println(queueAndStack.peekFirst());
        System.out.println(queueAndStack.peek());
        System.out.println(queueAndStack.poll());
        System.out.println(queueAndStack);
        System.out.println(queueAndStack.reversed());
        System.out.println(queueAndStack.removeLast());
        System.out.println(queueAndStack);
    }
}
