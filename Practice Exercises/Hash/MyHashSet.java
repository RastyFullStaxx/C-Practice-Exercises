class MyHashSet {
    private static final int BUCKET_SIZE = 1000;
    private List<Integer>[] buckets;

    public MyHashSet() {
        buckets = new List[BUCKET_SIZE];
    }

    public void add(int key) {
        int index = key % BUCKET_SIZE;

        if (buckets[index] == null) {
            buckets[index] = new ArrayList<>();
        }

        if (!buckets[index].contains(key)) {
            buckets[index].add(key);
        }
    }

    public void remove(int key) {
        int index = key % BUCKET_SIZE;

        if (buckets[index] != null) {
            buckets[index].remove(Integer.valueOf(key));
        }
    }

    public boolean contains(int key) {
        int index = key % BUCKET_SIZE;

        return buckets[index] != null && buckets[index].contains(key);
    }
}

public class DesignHashSetExample {
    public static void main(String[] args) {
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);
        hashSet.add(2);
        System.out.println("Contains 1: " + hashSet.contains(1));    // Output: true
        System.out.println("Contains 3: " + hashSet.contains(3));    // Output: false
        hashSet.add(2);
        System.out.println("Contains 2: " + hashSet.contains(2));    // Output: true
        hashSet.remove(2);
        System.out.println("Contains 2: " + hashSet.contains(2));    // Output: false
    }
}
