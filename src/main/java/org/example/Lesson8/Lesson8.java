package org.example.Lesson8;

import java.util.HashMap;
import java.util.Map;

public class Lesson8 {
    public static void main(String[] args) {
//        List<String> phones = new ArrayList<>();
//        phones.add("+1 222 333 444");
//        phones.add("+7 111 000 5555");
//        phones.add("+73 777 22 2277");
//
//        System.out.println("Первый тест");
//        sendKeys(phones.get(0));
//
//        System.out.println("Второй тест");
//        sendKeys(phones.get(1));
//
//        System.out.println("Третий тест");
//        sendKeys(phones.get(2));

//        Map<String, String> phones = new HashMap<>();
//        phones.put("USA", "+1 222 333 444");
//        phones.put("RU", "+7 111 000 5555");
//        phones.put("DN", "+43 777 22 2277");
//
//        System.out.println("Первый тест");
//        sendKeys(phones.get("USA"));
//
//        System.out.println("Второй тест");
//        sendKeys(phones.get("RU"));
//
//        System.out.println("Третий тест");
//        sendKeys(phones.get("DN"));

        String maintownCode = "12345";
        String lincolnCode = "321654";

        Map<String, String> codes = new HashMap<>();
        codes.put(maintownCode, "Maintown");
        codes.put(lincolnCode, "Lincoln");

        sendKeys(maintownCode);
        assertThatTextIsEqual(codes.get(maintownCode));

        sendKeys(lincolnCode);
        assertThatTextIsEqual(codes.get(lincolnCode));

//        Map<String, String> films = new HashMap<>();
//        films.put("Avengers", new Film("Мстители", 2012, 9.8));
    }

    public static void sendKeys(String phone) {
        System.out.println("Вводим данные: " + phone);
    }
    public static void assertThatTextIsEqual(String codes) {
        System.out.println(("Вводим данные: " + codes));
    }
}
