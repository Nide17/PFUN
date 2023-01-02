// Question 8.8
public class EnhancingDate {
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public EnhancingDate(int month, int day, int year) {

        // check if month in range
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException(
                    "month (" + month + ") must be 1-12");

        // check if day in range
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for month and year");

        // check for leap year
        if (month == 2 && day == 29 && !(year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for month and year");

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Constructor for Date date %s%n", this);
    }

    // CHECKINGS
    public void nextDay() {
        // Leap year
        if (day == 28 && month == 2 && year % 400 == 0) {
            day += 1;
        }

        // No increment needed
        else if (day >= daysPerMonth[month]) {
            // Increment year and setting date to 1st January - if month is 12
            if (month == 12) {
                year += 1;
                month = 1;
                day = 1;
            }

            // Setting the day to the first day of the month - if month is not 12
            else {
                month += 1;
                day = 1;
            }

        }
        // Incrementing the day of the month
        else {
            day += 1;
        }

    }

    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }

}