public class PerfectNumberChecker {
    public static void main(String[] args) {
        int num = 28;
        boolean isPerfect = isPerfectNumber(num);

        System.out.println(num + " is a perfect number? " + isPerfect);
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 1;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;

                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }
}
