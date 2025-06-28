package homeworks.Number3_L4.p6;

public class Gamers {
    public static void main(String[] args) {
        //создание массива из 10 и внесение туда списка имён
        String[] allGamers = {"Антуан Гризманн", "Ферран Торрес", "Мейсон Маунт", "Сон Хын Мин", "Луис Суарес",
                "Майка Кристенсон", "Ран Такахаши", "Максим Михайлов", "Антуан Бризар", "Томаш Форнал"};
        //вывод первых 3 игроков
        for (int i = 0; i < 3; i++) {
            System.out.println(allGamers[i]);
        }
    }
}