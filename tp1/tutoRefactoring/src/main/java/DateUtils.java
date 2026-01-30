import java.time.LocalDate;

public class DateUtils {
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        return LocalDate.now().isAfter(startingDate)
                &&
                LocalDate.now().isBefore(endingDate);
    }

    protected static boolean isDateBetween(LocalDate startingDate, LocalDate endingDate, LocalDate
            now, boolean inclusive) {
        LocalDate startingDay;
        LocalDate endingDay;
        if (inclusive) {
            startingDay = startingDate.minusDays(1); // la veille
            endingDay = startingDate.plusDays(1); // le lendemain
        }
        else {
            startingDay = startingDate;
            endingDay = startingDate;
        }
        return now.isAfter(startingDay)
                &&
                now.isBefore(endingDay);
    }

    private static boolean isDateOutsider(LocalDate startingDate, LocalDate
            endingDate, boolean inclusive) {
        return !isDateBetween(startingDate, endingDate, endingDate, inclusive);
    }
}