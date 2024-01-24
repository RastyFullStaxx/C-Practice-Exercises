import java.util.Arrays;

class HopscotchHashTable {
    private static final int TABLE_SIZE = 10;
    private String[] keys;
    private int[] neighborhoods;

    public HopscotchHashTable() {
        keys = new String[TABLE_SIZE];
        neighborhoods = new int[TABLE_SIZE];
        Arrays.fill(neighborhoods, 0b0);
    }

    public void insert(String key) {
        int index = hashFunction(key);

        while (index < TABLE_SIZE && neighborhoods[index] != 0b0) {
            int neighborhood = neighborhoods[index];
            int hop = Integer.lowestOneBit(neighborhood);

            if (hop == 0) {
                break; // Cannot hop further
            }

            int targetIndex = Integer.numberOfTrailingZeros(hop);
            neighborhoods[index] &= ~hop;
            neighborhoods[index] |= 1 << targetIndex;

            // Swap keys
            String tempKey = keys[index];
            keys[index] = keys[index + targetIndex];
            keys[index + targetIndex] = tempKey;

            index += targetIndex;
        }

        if (index < TABLE_SIZE) {
            keys[index] = key;
            neighborhoods[index] = 0b1;
        } else {
            // Handle overflow
            System.out.println("Table is full. Unable to insert key: " + key);
        }
    }

    public void displayTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.println("Index " + i + ": " + keys[i] + " (Neighborhood: " + Integer.toBinaryString(neighborhoods[i]) + ")");
        }
    }

    private int hashFunction(String key) {
        return key.length() % TABLE_SIZE;
    }

    public static void main(String[] args) {
        HopscotchHashTable hashTable = new HopscotchHashTable();
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
