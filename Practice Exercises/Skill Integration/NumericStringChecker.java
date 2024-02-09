public class NumericStringChecker {
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "12345";
        System.out.println("Is '" + str + "' numeric? " + isNumeric(str));
    }
}
