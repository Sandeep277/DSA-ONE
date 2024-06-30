package recursion.backtraking;

import java.util.ArrayList;

public class PrintPath {
    public static void main(String[] args) {

        /*
        Question: you can go Left and Down print how many ways you can go 1 to 9
         */
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        String path = "";
        path(board, path, 0, 0);

        ArrayList<String> list = new ArrayList<>();
        pathInArray(board, list, path, 0, 0);
        System.out.println(list);

        ArrayList<String> ans = pathInArray2(board, "", 0, 0);
        System.out.println(ans);

//        System.out.println(countPathInMaze(3, 3));
    }

    public static void path(boolean[][] maze, String path, int row, int col) {
        if (row == maze.length-1 && col == maze[0].length-1) {
            System.out.println(path);
            return;
        }

        if (row < maze.length-1) {
            path(maze, path+"D", row+1, col);
        }
        if (col < maze[0].length-1) {
            path(maze, path+"R", row, col+1);
        }
    }

    public static void pathInArray(boolean[][] maze, ArrayList<String> ans, String path, int r, int c) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            ans.add(path);
            return;
        }
        if (r < maze.length-1) {
            pathInArray(maze, ans, path+"L", r+1, c);
        }
        if (c < maze.length-1) {
            pathInArray(maze, ans, path+"D", r, c+1);
        }
    }

    public static ArrayList<String> pathInArray2(boolean[][] maze, String path, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r < maze.length - 1) {
            list.addAll(pathInArray2(maze, path + "D", r + 1, c));
        }
        if (c < maze[0].length - 1) {
            list.addAll(pathInArray2(maze, path + "R", r, c + 1));
        }

        return list;
    }

    static int countPathInMaze(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = countPathInMaze(r-1, c);
        int right = countPathInMaze(r, c-1);
        return left + right;
    }

}
