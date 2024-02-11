public class StringAnalyzer {
    public static void analyzeString(String str) {
        int words = str.split("\\s+").length;
        int characters = str.length();
        int lines = str.split("\r\n|\r|\n").length;
        System.out.println("Words: " + words);
        System.out.println("Characters: " + characters);
        System.out.println("Lines: " + lines);
    }

    public static void main(String[] args) {
        String text = "Java is a programming language.\nIt is widely used for building applications.";
        analyzeString(text);
    }
}
