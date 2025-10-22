package org.example.Lesson12;

import java.util.List;

public class Kinopoisk {
    public static void main(String[] args) {
//        MovieR movie1R = new MovieR("Sonic", "Фантастика");
//        movie1R.justMethod();
//        System.out.println(movie1R.title());
//        System.out.println(movie1R.genre());

        Movie movie1 = new Movie("Ф4", Genre.FANTASY);
        Movie movie2 = new Movie("Соник", Genre.COMEDY);
        Movie movie3 = new Movie("Супермен", Genre.ACTION);
        Movie movie4 = new Movie("Чумовая пятница 2", Genre.COMEDY);
        System.out.println(Genres.COMEDY.getTitle());

//        int countActionFilms = 0;
//        List<Movie> movies = List.of(movie1, movie2, movie3, movie4);
//        for (Movie movie : movies) {
//            if (movie.getGenre().equals(Genres.COMEDY)) {
//                countActionFilms++;
//            }
//        }
//        System.out.println(countActionFilms);


    }
}
