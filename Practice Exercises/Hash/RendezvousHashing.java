import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class RendezvousHashing {
    private Map<String, Integer> weights;

    public RendezvousHashing() {
        weights = new HashMap<>();
    }

    public void addNode(String node) {
        int weight = new Random().nextInt(100) + 1; // Assign a random weight between 1 and 100
        weights.put(node, weight);
    }

    public void removeNode(String node) {
        weights.remove(node);
    }

    public String getNode(String key) {
        String selectedNode = null;
        int maxWeight = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : weights.entrySet()) {
            String node = entry.getKey();
            int weight = entry.getValue();

            int hash = (key + node).hashCode();
            int combinedWeight = hash ^ weight;

            if (combinedWeight > maxWeight) {
                maxWeight = combinedWeight;
                selectedNode = node;
            }
        }

        return selectedNode;
    }

    public void displayWeights() {
        System.out.println("Node Weights:");
        weights.forEach((node, weight) -> System.out.println(node + " -> " + weight));
    }

    public static void main(String[] args) {
        RendezvousHashing rendezvousHashing = new RendezvousHashing();
        rendezvousHashing.addNode("Node A");
        rendezvousHashing.addNode("Node B");
        rendezvousHashing.addNode("Node C");

        rendezvousHashing.displayWeights();

        String key = "data123";
        String selectedNode = rendezvousHashing.getNode(key);
        System.out.println("Key '" + key +
