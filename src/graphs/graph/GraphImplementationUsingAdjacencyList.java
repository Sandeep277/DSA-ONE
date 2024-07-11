package graphs.graph;

import java.util.ArrayList;

public class GraphImplementationUsingAdjacencyList {
    public static void main(String[] args) {
        int vertex = 4; // Number of vertices
        int edges = 4;  // Number of edges
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Initialize the adjacency list for each vertex
        for (int i = 0; i <= vertex; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges to the graph
        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(2).add(4);
        graph.get(4).add(2);

        graph.get(3).add(4);
        graph.get(4).add(3);

        graph.get(1).add(3);
        graph.get(3).add(1);

        // Print the adjacency list representation of the graph
        for (int i = 1; i <= vertex; i++) {
            System.out.print("Vertex " + i + ": ");
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(graph.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
