package homeworks.Number3_L3.p3;

public class FavoriteMovies {
    public static void main(String[] args) {
//        String[] movies = {"Назад в будущее", "Неподдающиеся", "Мстители"};
        Movie[] films = {
                new Movie("Назад в будущее", 10, "SI-FI", "USA", false),
                new Movie("Неподдающиеся", 9, "comedy", "Russia", false),
                new Movie("Avengers", 8, "action", "USA", true)
        };

        System.out.println(films[0].name);
        System.out.println(films[1].country);
        System.out.println(films[2].genre);
    }
}
