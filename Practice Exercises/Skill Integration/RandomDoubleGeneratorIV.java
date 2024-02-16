import java.util.Random;

public class RandomDoubleGenerator {
    public static double generateRandomDouble(double min, double max) {
        Random random = new Random();
        return min + (max - min) * random.nextDouble();
    }

    public static void main(String[] args) {
        double min = 0.0;
        double max = 1.0;
        System.out.println("Random double between " + min + " and " + max + ": " + generateRandomDouble(min, max));
    }
}
