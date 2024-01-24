class CuckooHashTable {
    private static final int TABLE_SIZE = 10;
    private String[] table1;
    private String[] table2;
    private int[] hashFunctions;

    public CuckooHashTable() {
        table1 = new String[TABLE_SIZE];
        table2 = new String[TABLE_SIZE];
        hashFunctions = new int[]{3, 5}; // Two hash functions for cuckoo hashing
    }

    public void insert(String key) {
        int index1 = hashFunction1(key);
        int index2 = hashFunction2(key);

        if (table1[index1] == null) {
            table1[index1] = key;
        } else if (table2[index2] == null) {
            table2[index2] = key;
        } else {
            // Kick out the existing keys and re-insert
            String displacedKey1 = table1[index1];
            table1[index1] = key;
            insert(displacedKey1);

            String displacedKey2 = table2[index2];
            table2[index2] = key;
            insert(displacedKey2);
        }
    }

    public void displayTables() {
        System.out.println("Table 1: " + Arrays.toString(table1));
        System.out.println("Table 2: " + Arrays.toString(table2));
    }

    private int hashFunction1(String key) {
        return key.length() % TABLE_SIZE;
    }

    private int hashFunction2(String key) {
        return (key.length() * hashFunctions[0] + 1) % TABLE_SIZE;
    }

    public static void main(String[] args) {
        CuckooHashTable hashTable = new CuckooHashTable();
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

        hashTable.displayTables();
    }
}
