public class DisariumNumberChecker {
    public static boolean isDisariumNumber(int num) {
        int sum = 0;
        String numStr = String.valueOf(num);
        for (int i = 0; i < numStr.length(); i++) {
            sum += Math.pow(Character.getNumericValue(numStr.charAt(i)), i + 1);
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int number = 89;
        System.out.println(number + " is a Disarium number: " + isDisariumNumber(number));
    }
}
