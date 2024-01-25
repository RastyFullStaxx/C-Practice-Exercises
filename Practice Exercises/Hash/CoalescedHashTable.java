import java.util.LinkedList;

class CoalescedHashTable {
    private LinkedList<String>[] table;
    private LinkedList<Integer> freeList;

    public CoalescedHashTable() {
        table = new LinkedList[10];
        freeList = new LinkedList<>();
        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkedList<>();
            freeList.add(i);
        }
    }

    public void insert(String key) {
        int index = hashFunction(key);
        if (freeList.isEmpty()) {
            System.out.println("Table is full. Unable to insert key: " + key);
            return;
        }

        int freeSlotIndex = freeList.removeFirst();
        table[index].add(key);
        table[index].add(freeSlotIndex);
    }

    public void displayTable() {
        for (int i = 0; i < table.length; i++) {
            System.out.print("Index " + i + ": ");
            for (String key : table[i]) {
                System.out.print(key + " ");
            }
            System.out.println();
        }
    }

    private int hashFunction(String key) {
        return key.length() % table.length;
    }

    public static void main(String[] args) {
        CoalescedHashTable hashTable = new CoalescedHashTable();
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
