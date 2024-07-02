package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class BFS extends Tree {
    public static void main(String[] args) {
        Tree bst = new Tree();
        bst.insert(5);
        bst.insert(2);
        bst.insert(8);
        bst.insert(1);
        bst.insert(3);
        bst.insert(6);

        bfs(bst.root);
        System.out.println();

        ArrayList<Integer> ans = bfsList(bst.root);
        System.out.println(ans);


        List<List<Integer>> list = bfsListOfList(bst.root);
        for (List<Integer> li : list) {
            System.out.println(li);
        }
    }

    // BFS or Level order Traversal
    public static void bfs(Node node) {
        if (node == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.value + " ");

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    // Print level by level
    public static ArrayList<Integer> bfsList(Node node) {
        ArrayList<Integer> result = new ArrayList<>();
        if (node == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            result.add(current.value);

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return result;
    }

    // List of list
    public static List<List<Integer>> bfsListOfList(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                currentLevel.add(current.value);

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            result.add(currentLevel);
        }

        return result;
    }
}
