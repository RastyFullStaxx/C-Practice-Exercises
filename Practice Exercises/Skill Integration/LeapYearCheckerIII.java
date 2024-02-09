public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        int year = 2024;
        System.out.println(year + " is a leap year: " + isLeapYear(year));
    }
}
