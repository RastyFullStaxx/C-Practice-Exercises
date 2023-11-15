import java.security.SecureRandom;
import java.util.Random;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        int length = 10;
        String password = generateRandomPassword(length);

        System.out.println("Random Password: " + password);
    }

    public static String generateRandomPassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-+=<>?";

        Random random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }
}
