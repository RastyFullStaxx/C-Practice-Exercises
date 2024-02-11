import java.util.Random;

public class RandomIPv4Generator {
    public static String generateRandomIPv4() {
        Random rand = new Random();
        StringBuilder ipv4 = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            ipv4.append(rand.nextInt(256));
            if (i != 3) {
                ipv4.append(".");
            }
        }
        return ipv4.toString();
    }

    public static void main(String[] args) {
        System.out.println("Random IPv4 Address: " + generateRandomIPv4());
    }
}
