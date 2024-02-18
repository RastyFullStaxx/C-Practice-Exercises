public class PangramCaseInsensitiveChecker {
    public static boolean isPangram(String str) {
        boolean[] visited = new boolean[26];
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                visited[Character.toLowerCase(ch) - 'a'] = true;
            }
        }
        for (boolean value : visited) {
            if (!value) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println("Is the sentence a pangram? " + isPangram(sentence));
    }
}
