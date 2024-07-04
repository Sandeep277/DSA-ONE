package trees;
import java.util.*;

public class Questions {

    class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int value) {
            this.value = value;
        }
    }

    // build a tree using in-order and pre-order traversal
    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inOrder.length; i++) {
            map.put(inOrder[i], i);
        }

        int[] index = {0};

        return helper(preOrder, 0, inOrder.length - 1, map, index);
    }

    public TreeNode helper(int[] preOrder, int left, int right, HashMap<Integer, Integer> map, int[] index) {
        if (left > right) {
            return null;
        }

        int current = preOrder[index[0]];
        index[0]++;

        TreeNode node = new TreeNode(current);

        if (left == right) {
            return node;
        }

        int inOrderIndex = map.get(current);

        node.left = helper(preOrder, left, inOrderIndex - 1, map, index);
        node.right = helper(preOrder, inOrderIndex + 1, right, map, index);

        return node;
    }
}
