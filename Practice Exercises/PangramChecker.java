public class PangramChecker {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(str);

        System.out.println("Is the string a pangram? " + isPangram);
    }

    public static boolean isPangram(String str) {
        boolean[] isPresent = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ('A' <= ch && ch <= 'Z') {
                isPresent[ch - 'A'] = true;
            } else if ('a' <= ch && ch <= 'z') {
                isPresent[ch - 'a'] = true;
            }
        }

        for (boolean present : isPresent) {
            if (!present) {
                return false;
            }
        }

        return true;
    }
}
