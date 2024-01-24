import java.util.Arrays;

class RobinHoodHashTable {
    private static final int TABLE_SIZE = 10;
    private String[] keys;
    private int[] distances;

    public RobinHoodHashTable() {
        keys = new String[TABLE_SIZE];
        distances = new int[TABLE_SIZE];
        Arrays.fill(distances, -1);
    }

    public void insert(String key) {
        int index = hashFunction(key);
        int distance = 0;

        while (keys[index] != null && distance <= distances[index]) {
            // Robin Hood: Take from the rich (keys with longer distances) and give to the poor
            String tempKey = keys[index];
            int tempDistance = distances[index];

            keys[index] = key;
            distances[index] = distance;

            key = tempKey;
            distance = tempDistance + 1;

            index = (index + 1) % TABLE_SIZE;
        }

        keys[index] = key;
        distances[index] = distance;
    }

    public void displayTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.println("Index " + i + ": " + keys[i] + " (Distance: " + distances[i] + ")");
        }
    }

    private int hashFunction(String key) {
        return key.length() % TABLE_SIZE;
    }

    public static void main(String[] args) {
        RobinHoodHashTable hashTable = new RobinHoodHashTable();
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
