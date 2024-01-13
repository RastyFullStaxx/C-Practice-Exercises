class TrieNode {
    TrieNode[] children;
    String ipAddress;

    TrieNode() {
        children = new TrieNode[2];
        ipAddress = null;
    }
}

public class IPAddressLookup {
    public static void main(String[] args) {
        IPAddressLookup ipAddressLookup = new IPAddressLookup();
        ipAddressLookup.insert("192.168.1.1");
        ipAddressLookup.insert("192.168.1.10");
        ipAddressLookup.insert("192.168.2.1");

        System.out.println("Lookup '192.168.1.9': " + ipAddressLookup.lookup("192.168.1.9")); // Should return "192.168.1.1"
        System.out.println("Lookup '192.168.2.1': " + ipAddressLookup.lookup("192.168.2.1")); // Should return "192.168.2.1"
    }

    private TrieNode root;

    public IPAddressLookup() {
        // Implement a constructor to initialize the Trie
    }

    public void insert(String ipAddress) {
        // Implement a method to insert an IP address into the Trie
    }

    public String lookup(String ipAddress) {
        // Implement a method to lookup the closest matching IP address in the Trie
        return null;
    }
}
