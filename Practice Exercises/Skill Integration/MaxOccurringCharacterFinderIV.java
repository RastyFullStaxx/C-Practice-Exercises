public class MaxOccurringCharacterFinder {
    public static char findMaxOccurringCharacter(String str) {
        int[] frequency = new int[256];
        for (char ch : str.toCharArray()) {
            frequency[ch]++;
        }
        int maxCount = 0;
        char maxChar = '\0';
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxCount) {
                maxCount = frequency[i];
                maxChar = (char) i;
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {
        String text = "programming";
        System.out.println("Max occurring character: " + findMaxOccurringCharacter(text));
    }
}
