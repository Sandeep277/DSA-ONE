package dynamicprogramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CountPath {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        System.out.println(countPaths(maze, 0, 0, new HashMap<>()));

        int[][] mazeMax = {
                {2, 33, 55},
                {2, 33, 55},
                {2, 33, 55},
        };

        int[][] memo = new int[mazeMax.length][mazeMax.length];
        for(int[] arr : memo) {
            Arrays.fill(arr, -1);
        }
        System.out.println(maxPathSum(mazeMax, 0, 0, memo));

    }

    public static int countPaths(boolean[][] maze, int r, int c, HashMap<List<Integer>, Integer> memo) {
        if (r >= maze.length || c >= maze[0].length || !maze[r][c]) {
            return 0;
        }

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            return 1;
        }

        List<Integer> pos = List.of(r, c);
        if (memo.containsKey(pos)) {
            return memo.get(pos);
        }

        int result = countPaths(maze, r + 1, c, memo) + countPaths(maze, r, c + 1, memo);
        memo.put(pos, result);
        return result;
    }

    public static int maxPathSum(int[][] maze, int r, int c, int[][] memo) {
        if (r == maze[0].length || c == maze.length) {
            return 0;
        };

        if (r == maze[0].length-1 && c == maze.length-1) {
            return maze[r][c];
        }

        if (memo[r][c] != -1) {
            return memo[r][c];
        }

        int result = Math.max(maxPathSum(maze, r+1, c, memo), maxPathSum(maze, r, c+1, memo));
        memo[r][c] = maze[r][c] + result;
        return memo[r][c];

    }
}
