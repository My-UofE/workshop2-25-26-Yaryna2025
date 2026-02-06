public class MyBirthday {
    public static void main(String[] args) {
        int currentDay = Integer.parseInt(args[0]);
        int currentDate = Integer.parseInt(args[1]);
        int myBirthdayDate = Integer.parseInt(args[2]);

        final int DAYS_A_WEEK = 7;

        int daysUntilBirthday = myBirthdayDate - currentDate;
        int birthdayWeekday = (currentDay + daysUntilBirthday) % DAYS_A_WEEK;

        System.out.println("Birthday falls on: " + birthdayWeekday);
    }
}