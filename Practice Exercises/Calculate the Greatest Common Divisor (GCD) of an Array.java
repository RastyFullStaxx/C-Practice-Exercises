public class ArrayGCD {
    public static void main(String[] args) {
        int[] arr = {12, 24, 36};
        int gcd = calculateArrayGCD(arr);

        System.out.println("GCD of the array elements: " + gcd);
    }

    public static int calculateArrayGCD(int[] arr) {
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
        }

        return result;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
