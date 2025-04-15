import java.util.Scanner;

public class CalendarDisplay {

    public static String getMonthName(int month) {
        String[] monthNames = {"", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return monthNames[month];
    }

    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
        if (m < 3) {
            m += 12;
            y--;
        }
        int k = y % 100;
        int j = y / 100;
        int dayOfWeek = (k + (13 * (m + 1)) / 5 + j + j / 4 + k / 4 - 2 * j);
        dayOfWeek = (dayOfWeek % 7 + 7) % 7;
        return dayOfWeek;
    }

    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDayOfMonth = getFirstDayOfMonth(month, year);

        System.out.println("\n   " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDayOfMonth; i++) {
            System.out.print("    ");
        }

        for (int day = 1, currentDayOfWeek = firstDayOfMonth; day <= daysInMonth; day++, currentDayOfWeek++) {
            System.out.printf("%3d ", day);
            if (currentDayOfWeek % 7 == 6) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a value between 1 and 12.");
        } else {
            displayCalendar(month, year);
        }

        scanner.close();
    }
}