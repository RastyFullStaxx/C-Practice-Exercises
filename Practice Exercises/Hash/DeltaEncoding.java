import java.util.ArrayList;
import java.util.List;

class DeltaEncoding {
    public static List<Integer> encode(List<Integer> numbers) {
        List<Integer> encoded = new ArrayList<>();
        encoded.add(numbers.get(0));

        for (int i = 1; i < numbers.size(); i++) {
            int diff = numbers.get(i) - numbers.get(i - 1);
            encoded.add(diff);
        }

        return encoded;
    }

    public static List<Integer> decode(List<Integer> encoded) {
        List<Integer> decoded = new ArrayList<>();
        decoded.add(encoded.get(0));

        for (int i = 1; i < encoded.size(); i++) {
            int value = decoded.get(i - 1) + encoded.get(i);
            decoded.add(value);
        }

        return decoded;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(22);
        numbers.add(30);

        List<Integer> encoded = encode(numbers);
        System.out.println("Encoded: " + encoded);

        List<Integer> decoded = decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}
