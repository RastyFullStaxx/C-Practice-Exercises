class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;
    Set<String> contacts;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
        contacts = new HashSet<>();
    }
}

public class ContactList {
    public static void main(String[] args) {
        ContactList contactList = new ContactList();

        contactList.addContact("John Doe");
        contactList.addContact("Jane Doe");
        contactList.addContact("John Smith");

        Set<String> suggestions = contactList.getContactsStartingWith("John");
        System.out.println("Contacts starting with 'John': " + suggestions); // Should return ["John Doe", "John Smith"]
    }

    private TrieNode root;

    public ContactList() {
        // Implement a constructor to initialize the Trie
    }

    public void addContact(String contact) {
        // Implement a method to add a contact to the Trie
    }

    public Set<String> getContactsStartingWith(String prefix) {
        // Implement a method to get contacts starting with a given prefix from the Trie
        return null;
    }
}
