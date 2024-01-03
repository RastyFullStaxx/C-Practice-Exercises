import java.util.List;

public class ValidWordSquare {
    public static void main(String[] args) {
        List<String> words = List.of(
                "abcd",
                "bnrt",
                "crmy",
                "dtye"
        );

        System.out.println("List of Words: " + words);
        boolean isValidSquare = validWordSquare(words);
        System.out.println("Is Valid Word Square: " + isValidSquare);
    }

    public static boolean validWordSquare(List<String> words) {
        // Implement a method to check if the given list of words forms a valid word square
        return false;
    }
}
