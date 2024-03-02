public class KaprekarNumberChecker {
    public static boolean isKaprekarNumber(int num) {
        long square = (long) num * num;
        String squareStr = String.valueOf(square);
        for (int i = 1; i < squareStr.length(); i++) {
            int part1 = Integer.parseInt(squareStr.substring(0, i));
            int part2 = Integer.parseInt(squareStr.substring(i));
            if (part1 + part2 == num && part2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 297;
        System.out.println(number + " is a Kaprekar number: " + isKaprekarNumber(number));
    }
}
