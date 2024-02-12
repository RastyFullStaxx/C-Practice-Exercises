public class TriangleAreaCalculator {
    public static double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        double side1 = 3;
        double side2 = 4;
        double side3 = 5;
        System.out.println("Area of the triangle: " + calculateTriangleArea(side1, side2, side3));
    }
}
