import java.security.SecureRandom;
import java.util.Random;

public class RandomPasswordGenerator {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=";

    public static String generatePassword(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(randomIndex));
        }
        return password.toString();
    }

    public static void main(String[] args) {
        int length = 12;
        System.out.println("Generated password: " + generatePassword(length));
    }
}
