public class CalculateAverage {
    public static void main(String[] args) {
        int[] numbers = { 85, 90, 78, 92, 88 };
        double average = calculateAverage(numbers);
        
        System.out.println("Numbers: " + arrayToString(numbers));
        System.out.println("Average: " + average);
    }

    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
