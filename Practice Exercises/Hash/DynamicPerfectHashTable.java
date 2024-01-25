import java.util.ArrayList;
import java.util.List;

class DynamicPerfectHashTable {
    private List<String>[] table;
    private int globalDepth;

    public DynamicPerfectHashTable() {
        globalDepth = 1;
        table = new List[1 << globalDepth];
        for (int i = 0; i < table.length; i++) {
            table[i] = new ArrayList<>();
        }
    }

    public void insert(String key) {
        int hash = hashFunction(key);
        table[hash].add(key);

        if (table[hash].size() > 2 * globalDepth) {
            doubleTable();
        }
    }

    public void displayTable() {
        for (int i = 0; i < table.length; i++) {
            System.out.println("Index " + i + ": " + table[i]);
        }
    }

    private int hashFunction(String key) {
        return key.length() % (1 << globalDepth);
    }

    private void doubleTable() {
        List<String>[] newTable = new List[table.length * 2];
        for (int i = 0; i < newTable.length; i++) {
            newTable[i] = new ArrayList<>();
        }

        for (int i = 0; i < table.length; i++) {
            int newIndex = i << 1;
            newTable[newIndex] = new ArrayList<>(table[i]);
            newTable[newIndex + 1] = new ArrayList<>(table[i]);
        }

        table = newTable;
        globalDepth++;
    }

    public static void main(String[] args) {
        DynamicPerfectHashTable hashTable = new DynamicPerfectHashTable();
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
