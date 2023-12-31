public class StrStrKMP {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";

        System.out.println("Haystack: " + haystack);
        System.out.println("Needle: " + needle);
        int index = strStrKMP(haystack, needle);
        System.out.println("Index of Needle in Haystack: " + index);
    }

    public static int strStrKMP(String haystack, String needle) {
        // Implement the KMP algorithm to find the index of the first occurrence of needle in haystack
        return -1;
    }
}
