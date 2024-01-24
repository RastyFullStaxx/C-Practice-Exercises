import java.util.LinkedList;

class SeparateChainingHashTable {
    private static final int TABLE_SIZE = 10;
    private LinkedList<String>[] table;

    public SeparateChainingHashTable() {
        table = new LinkedList[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public void insert(String key) {
        int index = hashFunction(key);
        table[index].add(key);
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
        SeparateChainingHashTable hashTable = new SeparateChainingHashTable();
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
