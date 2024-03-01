
enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public boolean isWeekend() {
        return this == SUNDAY || this == SATURDAY;
    }
}


public class WeekDay {
    public static void main(String[] args) {
        DayOfWeek sunday = DayOfWeek.SUNDAY;
        DayOfWeek monday = DayOfWeek.MONDAY;

        System.out.println("Is it a weekend? " + sunday.isWeekend());
        System.out.println("Is it a weekend? " + monday.isWeekend());
    }
}
