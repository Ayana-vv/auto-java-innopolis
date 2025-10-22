package homeworks.Attestation1.N2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Cactus {
    public static void main(String[] args) {
        try {
            //Ввести дату последнего полива
            System.out.println("Введите дату последнего полива в формате DD.MM.YY: ");
            Scanner scanner = new Scanner(System.in);
            String date = scanner.nextLine();

            //Форматирование даты в нужный формат
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yy");
            LocalDate lastDate = LocalDate.parse(date, dateTimeFormatter);
            CactusWatering cactusWatering = new CactusWatering();

            //Дата следующего полива
            LocalDate nextDate = cactusWatering.nextDate(lastDate);

            if (nextDate != null) {
                System.out.println("Кактус поливаем: " + nextDate);
            }
            else {
                System.out.println("Кактус пока не поливаем.");
            }
        }
        catch (DateTimeParseException dateTimeParseException) {
            System.out.println("Введите дату в правильном формате.");
        }
    }
}
