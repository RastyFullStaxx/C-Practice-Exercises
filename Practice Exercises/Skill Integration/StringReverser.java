public class StringReverser {
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    
    public static void main(String[] args) {
        String original = "Hello, World!";
        System.out.println("Reversed string: " + reverse(original));
    }
}
