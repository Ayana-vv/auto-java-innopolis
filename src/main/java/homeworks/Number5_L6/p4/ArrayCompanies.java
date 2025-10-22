package homeworks.Number5_L6.p4;

import java.util.ArrayList;
import java.util.List;

public class ArrayCompanies {
    public static void main(String[] args) {
        //список компаний
        List<Company> companies = new ArrayList<>();
        companies.add(new Company("CJm", 2012));
        companies.add(new Company("Netflix", 1997));
        companies.add(new Company("21st Century Fox", 2013));

        //список фильмов компаний
        List<String> company1 = companies.get(0).getFilms();
        company1.add("Tazza");
        company1.add("NanaTour");
        company1.add("F4");

        List<String> company2 = companies.get(1).getFilms();
        company2.add("Glass Onion");
        company2.add("Enola Holmes");
        company2.add("Bird Box");

        List<String> company3 = companies.get(2).getFilms();
        company3.add("X-Men");
        company3.add("Avatar");
        company3.add("Ice Age 5");

        //Вывод информации о всех компаниях с их фильмами
        for (Company company : companies)
        {
            System.out.println("Компания " + company.getName() + ": " + company.getFilms());
        }
    }
}
