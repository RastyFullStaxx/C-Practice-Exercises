public class NeonNumberChecker {
    public static boolean isNeonNumber(int num) {
        int square = num * num;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int number = 9;
        System.out.println(number + " is a Neon number: " + isNeonNumber(number));
    }
}
