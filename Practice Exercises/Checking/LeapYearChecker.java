public class LeapYearChecker {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeapYear = isLeapYear(year);

        System.out.println(year + " is a leap year? " + isLeapYear);
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
}
