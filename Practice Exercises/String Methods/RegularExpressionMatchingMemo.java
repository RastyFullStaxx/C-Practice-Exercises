public class RegularExpressionMatchingMemo {
    public static void main(String[] args) {
        String s = "aa";
        String p = "a*";

        System.out.println("String s: " + s);
        System.out.println("Pattern p: " + p);
        boolean isMatch = isMatchMemo(s, p);
        System.out.println("Is Match (Memoization): " + isMatch);
    }

    public static boolean isMatchMemo(String s, String p) {
        // Implement a method to check if a string matches a regular expression pattern using memoization
        return false;
    }
}
