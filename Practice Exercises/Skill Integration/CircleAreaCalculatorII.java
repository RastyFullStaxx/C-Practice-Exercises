public class CircleAreaCalculator {
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double radius = 5;
        System.out.println("Area of the circle: " + calculateCircleArea(radius));
    }
}
