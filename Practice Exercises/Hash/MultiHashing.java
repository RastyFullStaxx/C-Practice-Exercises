import java.util.ArrayList;
import java.util.List;

class MultiHashing {
    private List<ConsistentHashing> hashFunctions;

    public MultiHashing(int numHashFunctions) {
        hashFunctions = new ArrayList<>();
        for (int i = 0; i < numHashFunctions; i++) {
            hashFunctions.add(new ConsistentHashing());
        }
    }

    public void addNode(String node) {
        for (ConsistentHashing hashFunction : hashFunctions) {
            hashFunction.addServer(node);
        }
    }

    public void removeNode(String node) {
        for (ConsistentHashing hashFunction : hashFunctions) {
            hashFunction.removeServer(node);
        }
    }

    public String getNode(String key) {
        int selectedFunctionIndex = key.hashCode() % hashFunctions.size();
        ConsistentHashing selectedHashFunction = hashFunctions.get(selectedFunctionIndex);
        return selectedHashFunction.getServer(key);
    }

    public void displayRings() {
        System.out.println("Consistent Hashing Rings:");
        for (int i = 0; i < hashFunctions.size(); i++) {
            System.out.println("Hash Function " + i + ":");
            hashFunctions.get(i).displayRing();
        }
    }

    public static void main(String[] args) {
        MultiHashing multiHashing = new MultiHashing(3);

        multiHashing.addNode("Node A");
        multiHashing.addNode("Node B");
        multiHashing.addNode("Node C");

        multiHashing.displayRings();

        String key = "data123";
        String selectedNode = multiHashing.getNode(key);
        System.out.println("Key '" + key + "' is assigned to Node: " + selectedNode);

        multiHashing.removeNode("Node B");

        multiHashing.displayRings();

        key = "data456";
        selectedNode = multiHashing.getNode(key);
        System.out.println("Key '" + key + "' is assigned to Node: " + selectedNode);
    }
}
