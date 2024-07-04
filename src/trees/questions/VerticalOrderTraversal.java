package trees.questions;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}

class Pair {
    TreeNode node;
    int hd; // horizontal distance

    Pair(TreeNode node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class VerticalOrderTraversal {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        // Map to hold the vertical order traversal
        Map<Integer, List<Integer>> map = new TreeMap<>();
        // Queue for BFS
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            TreeNode node = current.node;
            int hd = current.hd;

            map.putIfAbsent(hd, new ArrayList<>());
            map.get(hd).add(node.val);

            if (node.left != null) {
                queue.offer(new Pair(node.left, hd - 1));
            }

            if (node.right != null) {
                queue.offer(new Pair(node.right, hd + 1));
            }
        }

        for (List<Integer> vertical : map.values()) {
            result.add(vertical);
        }

        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        VerticalOrderTraversal verticalOrderTraversal = new VerticalOrderTraversal();
        List<List<Integer>> result = verticalOrderTraversal.verticalOrder(root);

        for (List<Integer> vertical : result) {
            System.out.println(vertical);
        }
    }
}
