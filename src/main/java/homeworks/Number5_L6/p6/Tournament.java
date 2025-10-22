package homeworks.Number5_L6.p6;

import java.util.*;

public class Tournament {
    public static void main(String[] args) {
        //Добавление 10 игроков
        Map<Player, Integer> points = new HashMap<>();
        Player player1 = new Player(1, "Fornal", 0);
        Player player2 = new Player(2, "Micah", 0);
        Player player3 = new Player(3, "Nikolov", 0);
        Player player4 = new Player(4, "Romano", 0);
        Player player5 = new Player(5, "Ran", 0);
        Player player6 = new Player(6, "Frenki", 0);
        Player player7 = new Player(7, "Ferran", 0);
        Player player8 = new Player(8, "Pedri", 0);
        Player player9 = new Player(9, "Rice", 0);
        Player player10 = new Player(10, "Grizmann", 0);

        //Присвоение очков игрокам
        player4.setPoint(10);
        player7.setPoint(12);
        player8.setPoint(11);
        player9.setPoint(13);
        player10.setPoint(5);
        List<Player> players = new ArrayList<>(List.of(player1, player2, player3, player4, player5, player6, player7,
                player8, player9, player10));
//        System.out.println(players);

        //Вывод 3 лучших игроков с сортировкой
        System.out.println("3 лучших игрока турнира:");
        //сортировка очков по убыванию
        Comparator<Player> comparatorPoint = new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o2.getPoint() - o1.getPoint();
            }
        };
        players.sort(comparatorPoint);
        System.out.println(players.subList(0, 3));      //вывод 3 лучших игроков
    }
}
