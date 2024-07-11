package graphs.graph;

import java.util.ArrayList;
import java.util.List;

public class DFSGraph {
    private int vertices; // Number of vertices
    private ArrayList<ArrayList<Integer>> adjList; // Adjacency list

    // Constructor
    public DFSGraph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Add an edge to the graph
    public void addEdge(int v, int w) {
        adjList.get(v).add(w); // Add w to v's list
        adjList.get(w).add(v); // Add v to w's list (if the graph is undirected)
    }

    // DFS traversal from a given source using recursion
    public void DFS(int start) {
        boolean[] visited = new boolean[vertices]; // Mark all the vertices as not visited
        DFSUtil(start, visited);
    }

    // Utility function for DFS
    private void DFSUtil(int v, boolean[] visited) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this vertex
        for (int neighbor : adjList.get(v)) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        DFSGraph graph = new DFSGraph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("Depth First Traversal starting from vertex 0:");
        graph.DFS(0);
    }
}
