package homeworks.Number5_L6.p3;

import java.util.Objects;

public class Movie1 {
    private String name;
    private int rank;
    private String genre;
    private String country;
    private boolean isOscar;

    public Movie1(String name, int rank, String genre, String country, boolean isOscar) {
        this.name = name;
        this.rank = rank;
        this.genre = genre;
        this.country = country;
        this.isOscar = isOscar;
    }

    //переопределение метода, чтобы при выводе была полная информация о фильме
    @Override
    public String toString() {
        return "Movie1{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                ", genre='" + genre + '\'' +
                ", country='" + country + '\'' +
                ", isOscar=" + isOscar +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie1 movie = (Movie1) o;
        return rank == movie.rank && isOscar == movie.isOscar && Objects.equals(name, movie.name) && Objects.equals(genre, movie.genre) && Objects.equals(country, movie.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rank, genre, country, isOscar);
    }
}
