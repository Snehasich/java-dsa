package VTP_technical.Day4;

import java.util.*;

public class PriorityQueueEg {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(); // MIN heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.offer(1);
        pq.offer(-1);
        pq.offer(100);
        pq.offer(20);
        pq.offer(9);

        System.out.println(pq);

        System.out.println(pq.poll());      // returns the highest-priority element.
        System.out.println(pq);

        System.out.println(pq.poll());      // returns the highest-priority element.
        System.out.println(pq);

        System.out.println(pq.peek());      // Returns the highest-priority element without removing it.
        System.out.println(pq);

    }
}
