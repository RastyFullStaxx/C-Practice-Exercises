public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Hello, World!";
        String reversed = reverseSentence(sentence);

        System.out.println("Original: " + sentence);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
}
