package homeworks.Attestation1.N4;

import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {

    public static void main(String[] args) {
//        int userScore = 0;
//        int pcScore = 0;
        Game game = new Game();

        //объявление цикла, т.к. игра состоит из 5 раундов
        for (int i = 1; i <= 5; i++) {
            //выбор пользователя
            System.out.println("Раунд №" + i + "\nВыберите одно из значений: К - камень, Н - ножницы, Б - бумага");
            Scanner scanner = new Scanner(System.in);                                                 //ввод одного из 3х значений пользователем
            String userValue = scanner.nextLine();

            if (!userValue.toUpperCase().equals("К") && !userValue.toUpperCase().equals("Н") &&
                    !userValue.toUpperCase().equals("Б")) {                                           //проверка на строчные буквы
                System.out.println("Некорректное значение! \nПопробуйте заново.\n");                  //если некорректно, то вывод сообщения
                i--;                                                                                  //счётчик раунда остаётся прежний
                continue;
            }
            //выбор компьютера
            Random random = new Random();
            String[] value = {"К", "Н", "Б"};
            String pcValue = value[random.nextInt(3)];
            System.out.println("Значение компьютера: " + pcValue);

            //ход игры
            game.moveGame(userValue, pcValue);

        }

//        game.getUserScore();
//        game.getPcScore();

        //Вывод всех итогов:
        System.out.println("Итоговый счёт: у вас - " + game.getUserScore() + " б., у компьютера - " + game.getPcScore() + " б.");
        if (game.getUserScore() == game.getPcScore()) {
            System.out.println("Ничья!");
        } else if (game.getUserScore() > game.getPcScore()) {
            System.out.println("Вы победили!");
        } else {
            System.out.println("Победил компьютер!");
        }
    }
}
