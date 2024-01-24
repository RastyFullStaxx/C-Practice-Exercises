class PerfectHashTable {
    private static final int TABLE_SIZE = 10;
    private String[][] table;

    public PerfectHashTable() {
        table = new String[TABLE_SIZE][];
    }

    public void insert(String key) {
        int index = hashFunction(key);
        if (table[index] == null) {
            table[index] = new String[]{key};
        } else {
            // Handle collisions with a secondary hash function
            int secondaryIndex = key.length() % table[index].length;
            if (table[index][secondaryIndex] == null) {
                table[index][secondaryIndex] = key;
            } else {
                // Handle collisions by resizing and rehashing
                resizeAndRehash();
                insert(key);
            }
        }
    }

    public void displayTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.println("Index " + i + ": " + Arrays.toString(table[i]));
        }
    }

    private int hashFunction(String key) {
        return key.length() % TABLE_SIZE;
    }

    private void resizeAndRehash() {
        // Implement resizing and rehashing logic
    }

    public static void main(String[] args) {
        PerfectHashTable hashTable = new PerfectHashTable();
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
