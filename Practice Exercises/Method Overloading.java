public class OverloadingExample {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadingExample calculator = new OverloadingExample();
        int result1 = calculator.add(5, 7);
        double result2 = calculator.add(3.5, 2.5);
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
