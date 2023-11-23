public class VowelsConsonantsCounter {
    public static void main(String[] args) {
        String text = "Hello, World!";
        int[] counts = countVowelsConsonants(text);

        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
    }

    public static int[] countVowelsConsonants(String text) {
        text = text.toLowerCase();
        int vowels = 0;
        int consonants = 0;

        for (char c : text.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        int[] counts = {vowels, consonants};
        return counts;
    }
}
