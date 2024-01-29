import java.util.*;

class ConsistentHashingWithVirtualNodes {
    private TreeMap<Integer, String> ring;
    private int numVirtualNodes;

    public ConsistentHashingWithVirtualNodes(int numVirtualNodes) {
        ring = new TreeMap<>();
        this.numVirtualNodes = numVirtualNodes;
    }

    public void addServer(String server) {
        for (int i = 0; i < numVirtualNodes; i++) {
            String virtualNode = server + "#" + i;
            int hash = hashFunction(virtualNode);
            ring.put(hash, server);
        }
    }

    public void removeServer(String server) {
        for (int i = 0; i < numVirtualNodes; i++) {
            String virtualNode = server + "#" + i;
            int hash = hashFunction(virtualNode);
            ring.remove(hash);
        }
    }

    public String getServer(String key) {
        int hash = hashFunction(key);
        Integer serverHash = ring.ceilingKey(hash);

        if (serverHash == null) {
            // Wrap around to the first server in the ring
            serverHash = ring.firstKey();
        }

        return ring.get(serverHash);
    }

    public void displayRing() {
        System.out.println("Consistent Hashing Ring:");
        ring.forEach((hash, server) -> System.out.println(hash + " -> " + server));
    }

    private int hashFunction(String key) {
        return key.hashCode();
    }

    public static void main(String[] args) {
        ConsistentHashingWithVirtualNodes hashing = new ConsistentHashingWithVirtualNodes(3);
        hashing.addServer("Server A");
        hashing.addServer("Server B");
        hashing.addServer("Server C");

        hashing.displayRing();

        String key = "data123";
        String selectedServer = hashing.getServer(key);
        System.out.println("Key '" + key + "' is assigned to Server: " + selectedServer);

        hashing.removeServer("Server B");

        hashing.displayRing();

        key = "data456";
        selectedServer = hashing.getServer(key);
        System.out.println("Key '" + key + "' is assigned to Server: " + selectedServer);
    }
}
