package collectionsInJava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        // Create a new Queue
        Queue<Integer> queue = new LinkedList<>();

        // Add elements using add() and offer()
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.offer(5);
        queue.offer(6);

//        print(queue);

        // Display the queue
        System.out.println("Initial queue: " + queue);

        // Remove elements using remove() and poll()
        queue.remove(); // Removes the head of the queue
        System.out.println("After remove(): " + queue);
        queue.poll(); // Removes the head of the queue
        System.out.println("After poll(): " + queue);

        // Peek at the head of the queue
        System.out.println("Peek: " + queue.peek());

        // Get the head of the queue using element()
        System.out.println("Element: " + queue.element());

        // Check if queue contains an element
        System.out.println("Contains 3: " + queue.contains(3));
        System.out.println("Contains 7: " + queue.contains(7));

        // Get the size of the queue
        System.out.println("Size: " + queue.size());

        // Loop through the queue using different methods

        // For-each loop
        System.out.println("For-each loop:");
        for (Integer num : queue) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Iterator
        System.out.println("Iterator:");
        var iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // While loop with poll (modifies the queue)
        System.out.println("While loop with poll:");
        Queue<Integer> tempQueue = new LinkedList<>(queue); // Create a temporary copy
        while (!tempQueue.isEmpty()) {
            System.out.print(tempQueue.poll() + " ");
        }
        System.out.println();

        // Clear the queue
        queue.clear();
        System.out.println("After clear(): " + queue);
    }

    // print using iterator
    public static void print(Queue<Integer> q){
        Iterator<Integer> itr = q.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
