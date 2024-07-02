package collectionsInJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Adding elements
        map.put(1, 2);
        map.put(2, 8);
        map.put(3, 7);
        map.put(4, 6);
        map.put(5, 5);
        map.put(6, 4);

        print(map);

        // Display keys
        System.out.println("Keys: " + map.keySet());

        // Display values
        System.out.println("Values: " + map.values());

        // Access a value
        System.out.println("Value for key 2: " + map.get(2));

        // Remove an element
        System.out.println("Removed value for key 2: " + map.remove(2));

        // Check if a key exists
        System.out.println("Contains key 1: " + map.containsKey(1));

        // Check if a value exists
        System.out.println("Contains value 2: " + map.containsValue(2));

        // Update a value
        map.put(3, 10);
        System.out.println("Updated value for key 3: " + map.get(3));

        // Check the size of the HashMap
        System.out.println("Size of map: " + map.size());

        // Clear the HashMap
        map.clear();
        System.out.println("Map after clear: " + map);
    }

    public static void print(HashMap<Integer, Integer> map) {
        // Loop through the HashMap using different methods

        // 1. For-each loop to iterate over keys
        System.out.println("For-each loop (keys):");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // 2. For-each loop to iterate over values
        System.out.println("For-each loop (values):");
        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }

        // 3. For-each loop to iterate over entry set
        System.out.println("For-each loop (entry set):");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 4. Using an iterator to iterate over entry set
        System.out.println("Iterator (entry set):");
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
