package trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.display();

        BST bst = new BST();
        bst.insert(6);
        bst.insert(4);
        bst.insert(2);
        bst.insert(7);
        bst.display();

        DFS dfs = new DFS();
        dfs.insertVal(5);
        dfs.insertVal(4);
        dfs.insertVal(2);
        dfs.insertVal(6);
        dfs.insertVal(5);
        dfs.insertVal(7);
        dfs.display();


    }
}
