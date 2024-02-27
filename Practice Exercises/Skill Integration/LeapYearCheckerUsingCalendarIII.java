import java.util.GregorianCalendar;

public class LeapYearCheckerUsingCalendar {
    public static boolean isLeapYear(int year) {
        return new GregorianCalendar().isLeapYear(year);
    }

    public static void main(String[] args) {
        int year = 2024;
        System.out.println(year + " is a leap year: " + isLeapYear(year));
    }
}
