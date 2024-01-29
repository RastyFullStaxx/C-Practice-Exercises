import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class MinHash {
    private int numHashFunctions;
    private int[] hashCoefficients;

    public MinHash(int numHashFunctions) {
        this.numHashFunctions = numHashFunctions;
        hashCoefficients = new int[numHashFunctions];
        Random random = new Random();

        for (int i = 0; i < numHashFunctions; i++) {
            hashCoefficients[i] = random.nextInt();
        }
    }

    public int[] computeMinHash(Set<String> set) {
        int[] minHashValues = new int[numHashFunctions];
        Arrays.fill(minHashValues, Integer.MAX_VALUE);

        for (String element : set) {
            int hash = element.hashCode();
            for (int i = 0; i < numHashFunctions; i++) {
                minHashValues[i] = Math.min(minHashValues[i], hash ^ hashCoefficients[i]);
            }
        }

        return minHashValues;
    }

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("apple", "banana", "orange"));
        Set<String> set2 = new HashSet<>(Arrays.asList("apple", "kiwi", "melon"));

        MinHash minHash = new MinHash(5);
        int[] minHashValues1 = minHash.computeMinHash(set1);
        int[] minHashValues2 = minHash.computeMinHash(set2);

        System.out.println("MinHash values for set 1: " + Arrays.toString(minHashValues1));
        System.out.println("MinHash values for set 2: " + Arrays.toString(minHashValues2));
    }
}
