import java.util.LinkedList;

class ExtendableHashTable {
    private int globalDepth;
    private LinkedList<String>[] buckets;

    public ExtendableHashTable() {
        globalDepth = 1;
        buckets = new LinkedList[1 << globalDepth];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public void insert(String key) {
        int hash = hashFunction(key);
        if (!buckets[hash].contains(key)) {
            buckets[hash].add(key);
            if (buckets[hash].size() > 2) {
                splitBucket(hash);
            }
        }
    }

    public void displayTable() {
        for (int i = 0; i < buckets.length; i++) {
            System.out.println("Bucket " + i + ": " + buckets[i]);
        }
    }

    private int hashFunction(String key) {
        return key.length() % (1 << globalDepth);
    }

    private void splitBucket(int bucketIndex) {
        if (globalDepth == getLocalDepth(bucketIndex)) {
            doubleTable();
        }

        int newBucketIndex = bucketIndex + (1 << (globalDepth - 1));
        buckets[newBucketIndex] = new LinkedList<>(buckets[bucketIndex]);
        buckets[bucketIndex].clear();

        if (getLocalDepth(newBucketIndex) > globalDepth) {
            globalDepth = getLocalDepth(newBucketIndex);
        }

        for (int i = 0; i < buckets.length; i++) {
            if (getLocalDepth(i) > globalDepth) {
                globalDepth = getLocalDepth(i);
            }
        }
    }

    private int getLocalDepth(int bucketIndex) {
        int mask = (1 << globalDepth) - 1;
        return Integer.bitCount(bucketIndex & mask);
    }

    private void doubleTable() {
        LinkedList<String>[] newBuckets = new LinkedList[buckets.length * 2];
        for (int i = 0; i < newBuckets.length; i++) {
            newBuckets[i] = new LinkedList<>();
        }

        for (int i = 0; i < buckets.length; i++) {
            int newIndex = i << 1;
            newBuckets[newIndex] = new LinkedList<>(buckets[i]);
            newBuckets[newIndex + 1] = new LinkedList<>(buckets[i]);
        }

        buckets = newBuckets;
        globalDepth++;
    }

    public static void main(String[] args) {
        ExtendableHashTable hashTable = new ExtendableHashTable();
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
