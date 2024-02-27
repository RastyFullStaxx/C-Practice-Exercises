public class LeapYearCheckerUsingZellers {
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        }
        if (year % 100 != 0) {
            return true;
        }
        return year % 400 == 0;
    }

    public static void main(String[] args) {
        int year = 2024;
        System.out.println(year + " is a leap year: " + isLeapYear(year));
    }
}
