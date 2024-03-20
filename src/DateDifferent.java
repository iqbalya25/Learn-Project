import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDifferent {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now(); //import data from java.time
        LocalDate otherdate = today.plus(3, ChronoUnit.DAYS); //day different from today using plus
        long diffday = ChronoUnit.DAYS.between(today, otherdate);

        System.out.println(today);
        System.out.println(otherdate);
        System.out.println(diffday);

    }

}
