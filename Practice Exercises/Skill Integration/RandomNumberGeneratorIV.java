import java.util.Random;

public class RandomNumberGenerator {
    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        System.out.println("Random number between " + min + " and " + max + ": " + generateRandomNumber(min, max));
    }
}
