import java.util.List;

public class FindAllAnagramsInString {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        System.out.println("String s: " + s);
        System.out.println("String p: " + p);
        List<Integer> anagramIndices = findAnagramsInString(s, p);
        System.out.println("Indices of All Anagrams: " + anagramIndices);
    }

    public static List<Integer> findAnagramsInString(String s, String p) {
        // Implement a method to find all the starting indices of anagrams of string p in string s
        return null;
    }
}
