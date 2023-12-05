import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }

    public Node(int val) {
        this.val = val;
        neighbors = new ArrayList<>();
    }

    public Node(int val, List<Node> neighbors) {
        this.val = val;
        this.neighbors = neighbors;
    }
}

public class CloneGraph {
    public static Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Map<Node, Node> nodeMap = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();

        nodeMap.put(node, new Node(node.val));
        queue.offer(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            for (Node neighbor : current.neighbors) {
                if (!nodeMap.containsKey(neighbor)) {
                    nodeMap.put(neighbor, new Node(neighbor.val));
                    queue.offer(neighbor);
                }

                nodeMap.get(current).neighbors.add(nodeMap.get(neighbor));
            }
        }

        return nodeMap.get(node);
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors = Arrays.asList(node2, node4);
        node2.neighbors = Arrays.asList(node1, node3);
        node3.neighbors = Arrays.asList(node2, node4);
        node4.neighbors = Arrays.asList(node1, node3);

        Node clonedNode = cloneGraph(node1);
        System.out.println("Cloned graph node values: " + clonedNode.val); // Output: 1
    }
}
