package homeworks.Number5_L6.p5;

import java.util.HashSet;

public class PlayerStorage {
    public static void main(String[] args) {
        //Создание 10 игроков и добавление в хранилище, проверяя дублирующие записи
        HashSet<Player> playersStorage = new HashSet<>();
        playersStorage.add(new Player(1, "Micah", true));
        playersStorage.add(new Player(1, "Micah", true));
        playersStorage.add(new Player(2, "Nikolov", false));
        playersStorage.add(new Player(3, "Romano", false));
        playersStorage.add(new Player(4, "Ran", true));
        playersStorage.add(new Player(5, "Fornal", true));
        playersStorage.add(new Player(6, "Frenki", true));
        playersStorage.add(new Player(7, "Ferran", true));
        playersStorage.add(new Player(8, "Pedri", true));
        playersStorage.add(new Player(9, "Rice", false));
        playersStorage.add(new Player(10, "Grizmann", false));
        playersStorage.add(new Player(7, "Ferran", true));       //дублирующие игроки,
        playersStorage.add(new Player(10, "Grizmann", false));   //которые не должны попасть в список

        //Вывод списка игроков
        System.out.println("Список игроков:");
        for (Player player : playersStorage) {
            System.out.println(player.getNickName());
        }
        System.out.println("Количество игроков: " + playersStorage.size());
    }
}
