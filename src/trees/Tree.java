package trees;

public class Tree {
    Node root;

    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        public Node (int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    // Insert
    public void insert(int val) {
        root = insert(root, val);
    }
    public Node insert(Node node, int val) {
        if (node == null) {
            node = new Node(val);
            return node;
        }

        if (val < node.value) {
            node.left = insert(node.left, val);
        }
        if (val > node.value) {
            node.right = insert(node.right, val);
        }

        return node;
    }
}
