public class PerfectSquareChecker {
    public static boolean isPerfectSquare(int num) {
        double squareRoot = Math.sqrt(num);
        return squareRoot == Math.floor(squareRoot);
    }

    public static void main(String[] args) {
        int number = 16;
        System.out.println(number + " is a perfect square: " + isPerfectSquare(number));
    }
}
