package linkList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // Insert First
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    // Insert Last
    public void insertLast(int val) {
        Node node = new Node(val);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node = tail;

        size += 1;
    }

    // Insert at index
    public void insertAt(int idx, int val) {
        if (idx < 0 || idx > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node node = new Node(val);

        if (idx == 0) {
            insertFirst(val);
            return;
        }

        if (idx == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int curr = 0; curr < idx - 1; curr++) {
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;

        size += 1;
    }

    // Delete first node
    public int deleteFirst() {
        if (size == 0) {
            return -1; // List is empty
        }
        Node node = head;
        head = head.next;
        size--;
        return node.value;
    }

    // Delete last node
    public int deleteLast() {
        if (size == 0) {
            return -1; // List is empty
        }
        if (size == 1) {
            int val = head.value;
            head = null;
            size--;
            return val;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int val = temp.next.value;
        temp.next = null;
        size--;
        return val;
    }

    // Delete at index
    public int deleteAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        int value = temp.next.value;
        temp.next = temp.next.next;
        size--;
        return value;
    }

    // Reverse a Link list
    public void reverse() {
        if (size < 2) {
            return;
        }

        Node prev = null;
        Node current = head;
        Node next = current.next;

        while (current != null) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        head = prev;
    }

    // Sorting - bubble sort
    public void bubbleSort() {
        bubbleSort(size-1, 0);
    }

    public void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.value > second.value) {
                // swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // Display
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

}
