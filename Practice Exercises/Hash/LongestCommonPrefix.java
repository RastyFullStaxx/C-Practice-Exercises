public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String commonPrefix = longestCommonPrefix(strs);

        System.out.println("Longest Common Prefix: " + commonPrefix);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];

        int minLength = Math.min(first.length(), last.length());
        int i = 0;

        while (i < minLength && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }
}
