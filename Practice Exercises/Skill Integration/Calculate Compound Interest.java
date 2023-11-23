public class CompoundInterestCalculator {
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 0.05;
        int time = 5;
        double compoundInterest = calculateCompoundInterest(principal, rate, time);

        System.out.println("Compound Interest: " + compoundInterest);
    }

    public static double calculateCompoundInterest(double principal, double rate, int time) {
        double amount = principal * Math.pow(1 + rate, time);
        return amount - principal;
    }
}
