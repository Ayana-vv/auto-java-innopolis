package homeworks.Number3_L3.p3_p5;

public class FavoriteMovies {
    public static void main(String[] args) {
        //массив фильмов
        Movie[] films = {
                new Movie("Назад в будущее", 10, "SI-FI", "USA", true),
                new Movie("Неподдающиеся", 9, "comedy", "Russia", false),
                new Movie("Avengers", 8, "action", "USA", false)
        };
        //вывод списка всех фильмов c их параметрами
        System.out.println("Вывод информации про любимые 3 фильма:");
        for (Movie movie : films) {
            System.out.println(movie.name + " " + movie.rank + " " + movie.genre + " " + movie.country + " " + "Оскар: " + movie.isOscar);
        }

        //задание №5 "Перебор массива"
        //добавление информации про год выпуска фильма
        films[0].year = 1985;
        films[1].year = 1959;
        films[2].year = 2012;
        //вывод информации о фильмах
        System.out.println("Вывод информации про фильмы:");
        for (Movie movie : films) {
            System.out.println("Год: " + movie.year + " " + "Название: " + movie.name + " " +
                    "Жанр: " + movie.genre + " " + "Рейтинг: " + movie.rank + " ");
        }
    }
}