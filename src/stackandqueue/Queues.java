package stackandqueue;

import java.util.*;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        for (Integer q : queue) {
            System.out.print(q + " ");
        }

        // Remove and return the front element
        int dequeuedElement = queue.poll();

        // Get the front element without removing it
        int frontElement = queue.peek();

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();

        System.out.println(queue);

        Iterator<Integer> itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " - ");
        }


        Deque<Integer> deque = new ArrayDeque<>();

        // Add elements to the deque
        deque.addFirst(1);
        deque.addLast(2);
        deque.addLast(3);

        // Remove and return the first element
        int firstElement = deque.removeFirst();

        // Remove and return the last element
        int lastElement = deque.removeLast();

        // Get the first element without removing it
        int peekFirst = deque.peekFirst();

        // Get the last element without removing it
        int peekLast = deque.peekLast();

        // Check if the deque is empty
        boolean empty = deque.isEmpty();

        System.out.println(deque);
    }
}
