public class ReverseWords {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String reversed = reverseWords(s);

        System.out.println("Reversed Words: " + reversed);
    }

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        return reversed.toString().trim();
    }
}
