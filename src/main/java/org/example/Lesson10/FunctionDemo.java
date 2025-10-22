package org.example.Lesson10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        List<String> names = List.of("Яблоко", "Груша", "Банан");

        Function<String, String> functionLength = new Function<String, String>() {
            @Override
            public String apply(String name) {
                System.out.println("длина слова");
                return String.valueOf(name.length());
            }
        };
        Function<String, String> functionUpper = new Function<String, String>() {
            @Override
            public String apply(String name) {
                System.out.println("верхний регистр");
//            hashMap.put(name, name.toUpperCase());
                return name.toUpperCase();
            }
        };

        System.out.println(map(names, functionLength));
        System.out.println(map(names, functionUpper));
    }

    private static Map<String, String> map(List<String> names, Function<String, String> function) {
        Map<String, String> hashMap = new HashMap<>();

        for (String name: names) {
//            System.out.println("длина слова");
//            hashMap.put(name, String.valueOf(name.length()));
            hashMap.put(name, function.apply(name));
//            System.out.println("верхний регистр");
//            hashMap.put(name, name.toUpperCase());
        }

        return hashMap;
    }
}
