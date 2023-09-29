public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Accessing an out-of-bounds index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array index out of bounds.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
