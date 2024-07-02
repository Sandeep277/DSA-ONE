package trees;

public class DFS {
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

    // Insert into BST
    public void insertVal(int val) {
        root = insertVal(root, val);
    }

    public Node insertVal(Node node, int val) {
        if (node == null) {
            return new Node(val);
        }

        if (val < node.value) {
            node.left = insertVal(node.left, val);
        } else if (val > node.value) {
            node.right = insertVal(node.right, val);
        }

        return node;
    }

    // Display
    public void display() {
        System.out.print("In Order : ");
        inOrder(this.root);

        System.out.println();
        System.out.print("Pre Order : ");
        preOrder(this.root);

        System.out.println();
        System.out.print("Post Order : ");
        postOrder(this.root);
    }

    // In-order
    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // Pre-order
    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // Post-order
    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }
}
