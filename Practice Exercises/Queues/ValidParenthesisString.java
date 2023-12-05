public class ValidParenthesisString {
    public static boolean checkValidString(String s) {
        int low = 0, high = 0;

        for (char ch : s.toCharArray()) {
            low += (ch == '(') ? 1 : -1;
            high += (ch != ')') ? 1 : -1;

            if (high < 0) {
                break;
            }

            low = Math.max(low, 0);
        }

        return low == 0;
    }

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "(*)";
        String s3 = "(*))";
        System.out.println("Is valid string (1): " + checkValidString(s1)); // Output: true
        System.out.println("Is valid string (2): " + checkValidString(s2)); // Output: true
        System.out.println("Is valid string (3): " + checkValidString(s3)); // Output: false
    }
}
