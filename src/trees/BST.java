package trees;

public class BST {

    Node root;

    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    // insert
    public void insert(int val) {
        root = insert(val, root);
    }

    public Node insert(int val, Node node) {
        if (node == null) {
            node = new Node(val);
            return node;
        }

        if (val < node.value) {
            node.left = insert(val, node.left);
        } else if (val > node.value) {
            node.right = insert(val, node.right);
        }

        return node;
    }

    // display in-order : print in sorted array
    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

}
