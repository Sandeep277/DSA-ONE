package algorithms;

import trees.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {

    }

    public static void bfs(Tree.Node node) {
        if (node == null) {
            return;
        }

        Queue<Tree.Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Tree.Node current = queue.poll();
            System.out.print(current.value + " ");

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }
}