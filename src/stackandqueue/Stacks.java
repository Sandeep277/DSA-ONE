package stackandqueue;

import java.util.Iterator;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Add elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        for(Integer it : stack) {
            System.out.print(it + " ");
        }

        // Remove and return the top element
        int poppedElement = stack.pop();

        // Get the top element without removing it
        int topElement = stack.peek();

        // Check if the stack is empty
        boolean isEmpty = stack.empty();

        // Search for an element (returns 1-based position from the top)
        int position = stack.search(2);

        System.out.println(stack);

        Iterator<Integer> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " : ");
        }
    }
}
