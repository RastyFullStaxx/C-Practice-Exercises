public class CaseInsensitiveAnagramChecker {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
        boolean areAnagrams = areCaseInsensitiveAnagrams(str1, str2);

        System.out.println("'" + str1 + "' and '" + str2 + "' are case-insensitive anagrams? " + areAnagrams);
    }

    public static boolean areCaseInsensitiveAnagrams(String str1, String str2) {
        str1 = str1.toLowerCase().replaceAll("[^a-z0-9]", "");
        str2 = str2.toLowerCase().replaceAll("[^a-z0-9]", "");

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
