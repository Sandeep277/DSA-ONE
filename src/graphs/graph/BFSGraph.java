package graphs.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {
    private int vertices; // Number of vertices
    private ArrayList<ArrayList<Integer>> adjList; // Adjacency list

    // Constructor
    public BFSGraph(int vertices) {
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

    // BFS traversal from a given source
    public void BFS(int start) {
        boolean[] visited = new boolean[vertices]; // Mark all the vertices as not visited
        Queue<Integer> queue = new LinkedList<>(); // Create a queue for BFS

        // Mark the current node as visited and enqueue it
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            // Dequeue a vertex from queue and print it
            int node = queue.poll();
            System.out.print(node + " ");

            // Get all adjacent vertices of the dequeued vertex node
            // If an adjacent vertex has not been visited, mark it visited and enqueue it
            for (int neighbor : adjList.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFSGraph graph = new BFSGraph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("Breadth First Traversal starting from vertex 0:");
        graph.BFS(0);
    }
}
