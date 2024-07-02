package collectionsInJava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main(String[] args) {

        // set contains unique element only
        HashSet<Integer> set = new HashSet<>();
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(7); // Duplicate element, will not be added
        set.add(9);

        set.remove(5);

        // Print the set
        System.out.println("Set: " + set);

        // Loop through the set using for-each
        System.out.print("For-each loop: ");
        for (Integer i : set) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Loop through the set using iterator
        System.out.print("Iterator: ");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Convert the set to an array and print it
        System.out.println("Set as array: " + Arrays.toString(set.toArray()));

        // Check if the set contains an element
        System.out.println("Set contains 5: " + set.contains(5));

        // Remove an element from the set
        set.remove(5);
        System.out.println("Set after removing 5: " + set);

        // Check the size of the set
        System.out.println("Size of set: " + set.size());

        // Clear the set
        set.clear();
        System.out.println("Set after clearing: " + set);
    }
}
