import java.util.Arrays;

class CountMinSketch {
    private int[][] sketch;
    private int[] hashFunctions;
    private int width;
    private int depth;

    public CountMinSketch(int width, int depth) {
        this.width = width;
        this.depth = depth;
        sketch = new int[depth][width];
        hashFunctions = new int[]{3, 5, 7}; // Example hash functions
    }

    public void add(String element) {
        for (int i = 0; i < depth; i++) {
            int hash = hashFunction(element, i);
            sketch[i][hash % width]++;
        }
    }

    public int count(String element) {
        int minCount = Integer.MAX_VALUE;
        for (int i = 0; i < depth; i++) {
            int hash = hashFunction(element, i);
            minCount = Math.min(minCount, sketch[i][hash % width]);
        }
        return minCount;
    }

    private int hashFunction(String element, int seed) {
        int hash = 0;
        for (char c : element.toCharArray()) {
            hash = seed * hash + c;
        }
        return Math.abs(hash);
    }

    public static void main(String[] args) {
        CountMinSketch sketch = new CountMinSketch(100, 3);
        sketch.add("apple");
        sketch.add("banana");
        sketch.add("apple");

        System.out.println("Count of 'apple': " + sketch.count("apple"));
        System.out.println("Count of 'grape': " + sketch.count("grape"));
    }
}
