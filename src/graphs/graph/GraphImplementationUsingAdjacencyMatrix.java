package graphs.graph;

import java.util.Arrays;

public class GraphImplementationUsingAdjacencyMatrix {
    public static void main(String[] args) {
        int vertex = 3;
        int[][] adj = new int[vertex + 1][vertex + 1];

        // edge 1--2
        adj[1][2] = 1;
        adj[2][1] = 1;

        // edge 2--3
        adj[2][3] = 1;
        adj[3][2] = 1;

        // edge 1--3
        adj[1][3] = 1;
        adj[3][1] = 1;

        // Print the adjacency matrix
        for (int i = 1; i <= vertex; i++) {
            System.out.println(Arrays.toString(adj[i]));
        }
    }
}
