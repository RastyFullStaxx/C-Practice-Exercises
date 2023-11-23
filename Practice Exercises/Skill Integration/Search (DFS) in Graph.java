import java.util.ArrayList;
import java.util.List;

class Graph {
    private int vertices;
    private List<List<Integer>> adjList;

    Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int v, int w) {
        adjList.get(v).add(w);
    }

    void depthFirstSearch(int startVertex) {
        boolean[] visited = new boolean[vertices];
        dfs(startVertex, visited);
    }

    private void dfs(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (Integer neighbor : adjList.get(vertex)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited);
            }
        }
    }
}

public class DepthFirstSearchGraph {
    public static void main(String[] args) {
        Graph graph = new Graph(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);

        System.out.print("Depth-First Search (DFS): ");
        graph.depthFirstSearch(0);
    }
}
