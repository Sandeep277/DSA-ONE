package collectionsInJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        // Create a new LinkedList
        LinkedList<Integer> ll = new LinkedList<>();

        // Add elements
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        System.out.println("Initial LinkedList: " + ll);

        System.out.println("Printing LikedList ");
        printLL(ll);


        // Add elements at the first and last positions
        ll.addFirst(0);
        ll.addLast(7);
        System.out.println("After adding first and last: " + ll);

        // Get elements
        System.out.println("First element: " + ll.getFirst());
        System.out.println("Last element: " + ll.getLast());
        System.out.println("Element at index 2: " + ll.get(2));

        // Remove elements
        ll.removeFirst();
        ll.removeLast();
        System.out.println("After removing first and last: " + ll);
        ll.remove(2);
        System.out.println("After removing element at index 2: " + ll);

        // Set element at a specific position
        ll.set(2, 10);
        System.out.println("After setting element at index 2 to 10: " + ll);

        // Add elements at a specific position
        ll.add(3, 4);
        ll.add(4, 6);
        System.out.println("After adding elements at specific positions: " + ll);

        // Other operations
        System.out.println("Index of 6: " + ll.indexOf(6));
        System.out.println("Contains 5: " + ll.contains(5));

        // Size of LinkedList
        System.out.println("Size of LinkedList: " + ll.size());

        // Clear LinkedList
        ll.clear();
        System.out.println("After clearing the LinkedList: " + ll);

        // Check if LinkedList is empty
        System.out.println("Is LinkedList empty? " + ll.isEmpty());

    }

    public static void printLL(LinkedList<Integer> ll) {
        // For-each loop
        System.out.println("For-each loop:");
        for (Integer num : ll) {
            System.out.print(num + " ");
        }
        System.out.println();

        // For loop with index
        System.out.println("For loop with index:");
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
        System.out.println();

        // Iterator
        System.out.println("Iterator:");
        Iterator<Integer> iterator = ll.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // While loop with pollFirst (modifies the list)
        System.out.println("While loop with pollFirst:");
        LinkedList<Integer> temp = new LinkedList<>(ll);  // Create a temporary copy for demonstration
        while (!temp.isEmpty()) {
            System.out.print(temp.pollFirst() + " ");
        }
        System.out.println();

        // While loop with getFirst (without modifying the list)
        System.out.println("While loop with getFirst:");
        temp = new LinkedList<>(ll);  // Reset temporary list
        while (!temp.isEmpty()) {
            System.out.print(temp.getFirst() + " ");
            temp.removeFirst();
        }
        System.out.println();
    }
}
