package homeworks.Number5_L6.p4;

import homeworks.Number5_L6.p3.Movie1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Company {
    private String name;
    private int year;
    private List<String> films;

    public Company(String name, int year) {
        this.name = name;
        this.year = year;
        this.films = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return year == company.year && Objects.equals(name, company.name) && Objects.equals(films, company.films);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, films);
    }

    @Override
    public String toString() {
        return "Company{" +
                "films=" + films +
                '}';
    }

    public List<String> getFilms() {
        return films;
    }

    public String getName() {
        return name;
    }
}
