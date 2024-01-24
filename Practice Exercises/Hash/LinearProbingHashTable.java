class LinearProbingHashTable {
    private static final int TABLE_SIZE = 10;
    private String[] table;

    public LinearProbingHashTable() {
        table = new String[TABLE_SIZE];
    }

    public void insert(String key) {
        int index = hashFunction(key);
        if (table[index] == null) {
            table[index] = key;
        } else {
            // Linear probing
            int i = 1;
            while (table[(index + i) % TABLE_SIZE] != null) {
                i++;
            }
            table[(index + i) % TABLE_SIZE] = key;
        }
    }

    public void displayTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.println("Index " + i + ": " + table[i]);
        }
    }

    private int hashFunction(String key) {
        return key.length() % TABLE_SIZE;
    }

    public static void main(String[] args) {
        LinearProbingHashTable hashTable = new LinearProbingHashTable();
        hashTable.insert("apple");
        hashTable.insert("banana");
        hashTable.insert("orange");
        hashTable.insert("grape");
        hashTable.insert("kiwi");
        hashTable.insert("melon");
        hashTable.insert("pear");
        hashTable.insert("berry");
        hashTable.insert("avocado");
        hashTable.insert("peach");

        hashTable.displayTable();
    }
}
