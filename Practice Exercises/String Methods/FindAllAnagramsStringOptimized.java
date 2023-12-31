import java.util.List;

public class FindAllAnagramsStringOptimized {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        System.out.println("String s: " + s);
        System.out.println("String p: " + p);
        List<Integer> anagramIndices = findAnagramsOptimized(s, p);
        System.out.println("Indices of All Anagrams: " + anagramIndices);
    }

    public static List<Integer> findAnagramsOptimized(String s, String p) {
        // Implement an optimized method to find all the starting indices of anagrams of string p in string s
        return null;
    }
}
