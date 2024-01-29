import java.util.BitSet;

class BloomFilter {
    private BitSet bitSet;
    private int numHashFunctions;
    private int size;

    public BloomFilter(int size, int numHashFunctions) {
        this.size = size;
        this.numHashFunctions = numHashFunctions;
        bitSet = new BitSet(size);
    }

    public void add(String element) {
        for (int i = 0; i < numHashFunctions; i++) {
            int hash = hashFunction(element, i);
            bitSet.set(hash % size);
        }
    }

    public boolean contains(String element) {
        for (int i = 0; i < numHashFunctions; i++) {
            int hash = hashFunction(element, i);
            if (!bitSet.get(hash % size)) {
                return false;
            }
        }
        return true;
    }

    private int hashFunction(String element, int seed) {
        int hash = 0;
        for (char c : element.toCharArray()) {
            hash = seed * hash + c;
        }
        return Math.abs(hash);
    }

    public static void main(String[] args) {
        BloomFilter filter = new BloomFilter(100, 3);
        filter.add("apple");
        filter.add("banana");
        filter.add("orange");

        System.out.println("Contains 'apple': " + filter.contains("apple"));
        System.out.println("Contains 'grape': " + filter.contains("grape"));
    }
}
