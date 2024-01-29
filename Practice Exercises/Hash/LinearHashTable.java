import java.util.LinkedList;

class LinearHashTable {
    private LinkedList<String>[] buckets;
    private int capacity;
    private int size;
    private int threshold;

    public LinearHashTable(int capacity) {
        this.capacity = capacity;
        buckets = new LinkedList[capacity];
        threshold = (int) (capacity * 0.75);

        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public void insert(String key) {
        int hash = hashFunction(key);
        buckets[hash].add(key);
        size++;

        if (size >= threshold) {
            resize();
        }
    }

    public boolean contains(String key) {
        int hash = hashFunction(key);
        return buckets[hash].contains(key);
    }

    private int hashFunction(String key) {
        return key.length() % capacity;
    }

    private void resize() {
        int newCapacity = capacity * 2;
        LinkedList<String>[] newBuckets = new LinkedList[newCapacity];

        for (int i = 0; i < newCapacity; i++) {
            newBuckets[i] = new LinkedList<>();
        }

        for (LinkedList<String> bucket : buckets) {
            for (String key : bucket) {
                int hash = key.length() % newCapacity;
                newBuckets[hash].add(key);
            }
        }

        buckets = newBuckets;
        capacity = newCapacity;
        threshold = (int) (capacity * 0
