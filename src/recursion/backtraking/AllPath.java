package recursion.backtraking;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPath {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        printAllPath(board, "", 0, 0);
        ArrayList<String> ans = allPath(board, "", 0, 0);
        System.out.println(ans);
    }

    /*
    Backtracking is a problem-solving algorithmic technique used to find all (or some)
    solutions to computational problems, particularly those that can be framed as
    finding solutions to constraint satisfaction problems. It incrementally builds
    candidates to the solutions, and abandons a candidate (backtracks) as soon as
    it determines that this candidate cannot possibly lead to a valid solution.

    Key Characteristics of Backtracking:
    Incremental Construction:

    Solutions are built incrementally, one piece at a time.
    Each decision point extends the current candidate solution with a choice from a set of possible moves.
    Exploration of All Possibilities:

    It explores all possible options for each decision point.
    Uses recursion to explore each possibility.
    Backtracking:

    If the current candidate solution cannot lead to a valid solution (it violates a constraint or fails a test),
    it backtracks by removing the last added piece (undoes the last decision) and tries the next possibility.
    This process continues until all possibilities have been explored.
    Constraint Satisfaction:

    Often used in problems where constraints must be met for a solution to be valid (e.g., Sudoku, N-Queens problem, maze solving).
    Recursive Approach:

    It is typically implemented using recursion, which naturally handles the exploration and backtracking process.
    Example Applications of Backtracking:
    Solving Puzzles: Sudoku, N-Queens, Crossword puzzles.
    Pathfinding Problems: Finding paths in a maze, Hamiltonian paths.
    Combinatorial Problems: Generating permutations, combinations, and subsets.
    Constraint Satisfaction Problems: Scheduling, map coloring.
    General Backtracking Algorithm:
    Start: Initialize a partial solution.
    Check: If the partial solution is a complete and valid solution, add it to the list of solutions.
    Explore: Try to extend the partial solution by adding the next possible element.
    Validate: If the extended solution is valid:
    Recursively explore further extensions.
    If invalid, remove the last added element and try the next possibility.
    Backtrack: If all extensions are invalid, backtrack to the previous state and try a different path.
    Repeat: Continue until all possibilities are exhausted
     */

    // Some Basics Example
    public static void printAllPath(boolean[][] board, String path, int r, int c) {
        if (r == board.length-1 && c == board[0].length-1) {
            System.out.println(path);
        }

        if (!board[r][c]) {
            return;
        }

        board[r][c] = false;

        // Go Down
        if (r < board.length-1) {
            printAllPath(board, path+"D", r+1, c);
        }

        // Go Down
        if (c < board[0].length-1) {
            printAllPath(board, path+"R", r, c+1);
        }

        // Go UP
        if (r > 0) {
            printAllPath(board, path+"U", r-1, c);
        }

        // Go UP
        if (c > 0) {
            printAllPath(board, path+"L", r, c-1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were by that function
        board[r][c] = true;

    }

    public static ArrayList<String> allPath(boolean[][] board, String path, int r, int c) {
        // Base case: if we've reached the bottom-right corner, return a list containing the current path
        if (r == board.length - 1 && c == board[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        // Mark the current cell as visited
        board[r][c] = false;

        // Move down if within bounds and not visited
        if (r < board.length - 1 && board[r + 1][c]) {
            list.addAll(allPath(board, path + "D", r + 1, c));
        }

        // Move right if within bounds and not visited
        if (c < board[0].length - 1 && board[r][c + 1]) {
            list.addAll(allPath(board, path + "R", r, c + 1));
        }

        // Move up if within bounds and not visited
        if (r > 0 && board[r - 1][c]) {
            list.addAll(allPath(board, path + "U", r - 1, c));
        }

        // Move left if within bounds and not visited
        if (c > 0 && board[r][c - 1]) {
            list.addAll(allPath(board, path + "L", r, c - 1));
        }

        // Unmarked the current cell to allow other paths || backtrack
        board[r][c] = true;

        return list;
    }
}
