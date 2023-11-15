public class PrimeNumberChecker {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = isPrimeNumber(num);

        System.out.println(num + " is a prime number? " + isPrime);
    }

    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
