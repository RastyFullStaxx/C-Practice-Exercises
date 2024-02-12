import java.util.Random;

public class RandomBooleanGenerator {
    public static boolean generateRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public static void main(String[] args) {
        System.out.println("Random boolean value: " + generateRandomBoolean());
    }
}
