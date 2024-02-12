public class PangramChecker {
    public static boolean isPangram(String str) {
        int[] frequency = new int[26];
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                frequency[Character.toLowerCase(ch) - 'a']++;
            }
        }
        for (int count : frequency) {
            if (count == 0) {
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
