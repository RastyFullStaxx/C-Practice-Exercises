public class CommandLineCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Usage: java CommandLineCalculator <num1> <operator> <num2>");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[2]);
        String operator = args[1];

        double result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.err.println("Invalid operator: " + operator);
                return;
        }

        System.out.println("Result: " + result);
    }
}
