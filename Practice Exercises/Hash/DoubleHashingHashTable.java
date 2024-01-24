class DoubleHashingHashTable {
    private static final int TABLE_SIZE = 10;
    private String[] table;

    public DoubleHashingHashTable() {
        table = new String[TABLE_SIZE];
    }

    public void insert(String key) {
        int index = hashFunction(key);
        int i = 1;
        while (table[index] != null) {
            index = (index + i * secondaryHashFunction(key)) % TABLE_SIZE;
            i++;
        }
        table[index] = key;
    }

    public void displayTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.println("Index " + i + ": " + table[i]);
        }
    }

    private int hashFunction(String key) {
        return key.length() % TABLE_SIZE;
    }

    private int secondaryHashFunction(String key) {
        // Choose a secondary hash function, e.g., length of key
        return key.length();
    }

    public static void main(String[] args) {
        DoubleHashingHashTable hashTable = new DoubleHashingHashTable();
        hashTable.insert("apple");
        hashTable.insert("banana");
        hashTable.insert("orange");
        hashTable.insert("grape");
        hashTable.insert("kiwi");
        hashTable.insert("melon");
        hashTable.insert("pear");
        hashTable.insert("berry
