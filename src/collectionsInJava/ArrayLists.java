package collectionsInJava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0));

        // Modifying elements
        fruits.set(2, "Blueberry");

        // Removing elements
        fruits.remove("Date");

        // Checking for elements
        boolean hasCherry = fruits.contains("Cherry");
        int index = fruits.indexOf("Cherry");
        boolean empty = fruits.isEmpty();
        int size = fruits.size();

        // Iterating over the list
        System.out.println("Fruits list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Sorting the list
        Collections.sort(fruits);
        System.out.println("Sorted list: " + fruits);

        // Checking for an element
        System.out.println("Contains Banana? " + fruits.contains("Banana"));
    }
}
