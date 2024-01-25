import java.util.TreeMap;

class ConsistentHashing {
    private TreeMap<Integer, String> ring;

    public ConsistentHashing() {
        ring = new TreeMap<>();
    }

    public void addServer(String server) {
        int hash = hashFunction(server);
        ring.put(hash, server);
    }

    public void removeServer(String server) {
        int hash = hashFunction(server);
        ring.remove(hash);
    }

    public String getServer(String key) {
        if (ring.isEmpty()) {
            return null;
        }

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
        // Simple hash function for demonstration purposes
        return key.length() % 360;
    }

    public static void main(String[] args) {
        ConsistentHashing consistentHashing = new ConsistentHashing();
        consistentHashing.addServer("Server A");
        consistentHashing.addServer("Server B");
        consistentHashing.addServer("Server C");

        consistentHashing.displayRing();

        String key = "data123";
        String assignedServer = consistentHashing.getServer(key);
        System.out.println("Key '" + key + "' is assigned to Server: " + assignedServer);

        consistentHashing.removeServer("Server B");

        consistentHashing.displayRing();

        key = "data456";
        assignedServer = consistentHashing.getServer(key);
        System.out.println("Key '" + key + "' is assigned to Server: " + assignedServer);
    }
}
