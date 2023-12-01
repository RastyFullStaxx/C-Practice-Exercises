public class CountAndSay {
    public static void main(String[] args) {
        int n = 5;

        String result = countAndSay(n);

        System.out.println("Count and Say sequence for n = " + n + ": " + result);
    }

    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String prev = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < prev.length(); i++) {
            if (i < prev.length() - 1 && prev.charAt(i) == prev.charAt(i + 1)) {
                count++;
            } else {
                result.append(count).append(prev.charAt(i));
                count = 1;
            }
        }

        return result.toString();
    }
}
