import java.util.regex.*;

public class RegexMatching {
    public static void main(String[] args) {
        String text = "Hello, Java!";
        String pattern = ".*Java.*";
        boolean matches = Pattern.matches(pattern, text);
        System.out.println("Matches: " + matches);
    }
}
