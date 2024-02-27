public class PerfectNumberChecker {
    public static boolean isPerfectNumber(int num) {
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i;
                }
            }
        }
        return sum == num && num != 1;
    }

    public static void main(String[] args) {
        int number = 28;
        System.out.println(number + " is a perfect number: " + isPerfectNumber(number));
    }
}
