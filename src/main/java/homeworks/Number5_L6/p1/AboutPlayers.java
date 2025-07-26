package homeworks.Number5_L6.p1;

import java.util.HashMap;
import java.util.Map;

public class AboutPlayers {
    public static void main(String[] args) {
        Map<String, Integer> rates = new HashMap<>();
        Player player1 = new Player(1, "GOAT", true);
        Player player2 = new Player(1, "GOAT", true);

        System.out.println("Проверка: player1 == player2 => " + (player1 == player2));         //сравнение игроков - false, т.к. их hashMap-ы не совпадают
        System.out.println("Проверка: player1.equals(player2) => " + player1.equals(player2));    //сравнение игроков - true, т.к. внутри содержание совпадает и создан метод equals
    }
}
