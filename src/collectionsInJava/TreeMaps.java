package collectionsInJava;

import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        tm.put(1, 2);
        tm.put(2, 8);
        tm.put(3, 7);
        tm.put(4, 6);
        tm.put(5, 5);
        tm.put(6, 4);
        tm.put(7, 3);

        System.out.println(tm);

        for (Integer i : tm.keySet()) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (Integer i : tm.values()) {
            System.out.print(i + " ");
        }

    }
}
