public class RegularExpressionMatchingOptimized {
    public static void main(String[] args) {
        String s = "mississippi";
        String p = "mis*is*p*.";

        System.out.println("String s: " + s);
        System.out.println("Pattern p: " + p);
        boolean isMatch = isMatchOptimized(s, p);
        System.out.println("Is Match (Optimized): " + isMatch);
    }

    public static boolean isMatchOptimized(String s, String p) {
        // Implement an optimized method to check if a string matches a regular expression pattern
        return false;
    }
}
