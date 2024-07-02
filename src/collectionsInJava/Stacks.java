package collectionsInJava;

import java.util.Arrays;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // Push elements onto the stack
        st.push(3);
        st.push(1);
        st.push(9);
        st.push(8);
        st.push(8); // Duplicate element, can be pushed onto stack
        st.push(6);
        st.push(7);
        st.push(5);

        // Print the stack
        System.out.println("Stack: " + st);

        // Convert the stack to an array and print it
        System.out.println("Stack as array: " + Arrays.toString(st.toArray()));

        // Pop an element from the stack
        System.out.println("Popped element: " + st.pop());
        System.out.println("Stack after pop: " + st);

        // Peek at the top element of the stack
        System.out.println("Top element: " + st.peek());

        // Check if the stack is empty
        System.out.println("Is stack empty? " + st.empty());

        // Search for an element in the stack
        int elementToSearch = 9;
        int position = st.search(elementToSearch);
        if (position == -1) {
            System.out.println(elementToSearch + " not found in stack");
        } else {
            System.out.println(elementToSearch + " found at position " + position);
        }

        // Clear the stack
        st.clear();
        System.out.println("Stack after clear: " + st);
    }
}
