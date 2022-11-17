import java.time.LocalDate;

public class DateCalculator {
    public int christmas() {
        LocalDate today = LocalDate.now();
        LocalDate christmasDate = LocalDate.of(2022,12,24);

        return christmasDate.getDayOfYear() - today.getDayOfYear();
    }


    public int daysToYearEnd() {
        LocalDate today = LocalDate.now();
        LocalDate yearEnd = LocalDate.of(2022,12,31);

        return yearEnd.getDayOfYear() - today.getDayOfYear();
    }

}
