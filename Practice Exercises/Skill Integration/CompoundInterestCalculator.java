public class CompoundInterestCalculator {
    public static double calculateCompoundInterest(double principal, double rate, int time) {
        return principal * Math.pow((1 + rate / 100), time) - principal;
    }

    public static void main(String[] args) {
        double principal = 1000;
        double rate = 5;
        int time = 3;
        System.out.println("Compound interest: " + calculateCompoundInterest(principal, rate, time));
    }
}
