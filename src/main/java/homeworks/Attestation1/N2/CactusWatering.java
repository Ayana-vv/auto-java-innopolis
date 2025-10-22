package homeworks.Attestation1.N2;

import java.time.LocalDate;
import java.time.Month;
import java.util.EnumSet;

public class CactusWatering {
    //перечисление времен года с месяцами
    private final EnumSet<Month> winter = EnumSet.of(Month.DECEMBER, Month.JANUARY, Month.FEBRUARY);
    private final EnumSet<Month> spring = EnumSet.of(Month.MARCH, Month.APRIL, Month.MAY);
    private final EnumSet<Month> summer = EnumSet.of(Month.JUNE, Month.JULY, Month.AUGUST);
    private final EnumSet<Month> autumn = EnumSet.of(Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER);

    //проверка следующей даты полива по месяцам
    public LocalDate nextDate(LocalDate previous) {
        Month month = previous.getMonth();

        //проверка по сезонам года
        if (winter.contains(month)) {
            return previous.plusMonths(1);                  //если зима, то 1 раз в месяц
        }
        else if (spring.contains(month) || autumn.contains(month)) {
            return previous.plusWeeks(1);                   //если весна или осень, то 1 раз в неделю
        }
        else if (summer.contains(month)) {                             //если лето, то зависит от влажности воздуха
            if (HumidityAir.humidityAir() < 30) {
                return previous.plusDays(2);
            }
        }
        return null;
    }
}
