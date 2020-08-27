import  java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDatem {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(2018, 4, 11);
        LocalDate localDate2 = LocalDate.parse("2018-02-13");
        LocalDate localDate3 = LocalDate.now();
        LocalDate localDate4 = LocalDate.ofYearDay(2015, 100);
        System.out.println(LocalDate.now());

        LocalTime localTime =LocalTime.now();



        LocalTime timeNow = LocalTime.now();
        LocalDate dateToday = LocalDate.now();
        LocalDateTime localDateTime6 = LocalDateTime.of(dateToday, timeNow);

    }
}
