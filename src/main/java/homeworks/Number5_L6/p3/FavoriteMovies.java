package homeworks.Number5_L6.p3;

import java.util.HashMap;
import java.util.Map;

public class FavoriteMovies {
    public static void main(String[] args) {
        //список фильмов (Movie1 - плохое название, но когда был Movie, то ссылался на созданный ранее)
        Map<Movie1, Integer> movies = new HashMap<>();
        Movie1 movie1 = new Movie1("Назад в будущее", 10, "SI-FI", "USA", true);
        Movie1 movie2 = new Movie1("Неподдающиеся", 9, "comedy", "Russia", false);
        Movie1 movie3 = new Movie1("Avengers", 8, "action", "USA", false);

        //присвоение индекса фильмам
        movies.put(movie1, 1);
        movies.put(movie2, 2);
        movies.put(movie3, 3);
        System.out.println("Фильм по индексу 1: " + movie1);        //вывод фильма
//        System.out.println("Фильм по индексу 3: " + movie3);        //вывод другого фильма
    }
}