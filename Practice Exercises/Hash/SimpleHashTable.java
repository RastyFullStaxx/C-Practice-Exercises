import java.util.LinkedList;

class SimpleHashTable<K, V> {
    private static final int SIZE = 10;
    private LinkedList<Entry<K, V>>[] table;

    public SimpleHashTable() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public void put(K key, V value) {
        int hash = key.hashCode() % SIZE;
        LinkedList<Entry<K, V>> bucket = table[hash];

        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }

        bucket.add(new Entry<>(key, value));
    }

    public V get(K key) {
        int hash = key.hashCode() % SIZE;
        LinkedList<Entry<K, V>> bucket = table[hash];

        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }

        return null;
    }

    public void remove(K key) {
        int hash = key.hashCode() % SIZE;
        LinkedList<Entry<K, V>> bucket = table[hash];

        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                bucket.remove(entry);
                return;
            }
        }
    }

    static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}

public class SimpleHashTableExample {
    public static void main(String[] args) {
        SimpleHashTable<String, Integer> hashTable = new SimpleHashTable<>();

        // Put key-value pairs into the hash table
        hashTable.put("one", 1);
        hashTable.put("two", 2);
        hashTable.put("three", 3);

        // Retrieve values by keys
        System.out.println("Value for key 'two': " + hashTable.get("two"));

        // Remove a key-value pair
        hashTable.remove("two");

        // Verify if the removed key is present
        System.out.println("Value for key 'two' after removal: " + hashTable.get("two"));
    }
}
