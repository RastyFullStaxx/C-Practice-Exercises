import java.util.Random;

public class RandomNumberGenerator {
    public static int generateRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {
        int min = 1, max = 100;
        System.out.println("Random number between " + min + " and " + max + ": " + generateRandom(min, max));
    }
}
