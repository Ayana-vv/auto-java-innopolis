package org.example.Lesson7;

import java.util.HashMap;
import java.util.Map;

public class HashMapWishObject {
    public static void main(String[] args) {
//        Map<String, String> capitals = new HashMap<>();
//        capitals.put("Россия", "Москва");
//        capitals.put("Армения", "Ереван");
//        capitals.put("США", "Вашингтон");
//
//        System.out.println("Армения".hashCode());
//        System.out.println("Армения".hashCode());
//        System.out.println("Армения".hashCode());
        Map<User, Double> rates = new HashMap<>();
        User user1 = new User("Jin", "Kim", 33, "kim@ya.ru", 32000);
        User user2 = new User("Jin", "Kim", 33, "kim@ya.ru", 32000);
        User user3 = new User("IM", "Im", 29, "im@ya.ru", 22000);
//        System.out.println(user1.hashCode());
//        System.out.println(user2.hashCode());
//        System.out.println(user3.hashCode());
//
        rates.put(user1, 10.0);
//        rates.put(user2, 8.2);
        rates.put(user3, 9.5);
        System.out.println(rates);
//        System.out.println(user1);
//
//        System.out.println(user1 == user2);

//        System.out.println(user1.name.equals(user2.name));
//        System.out.println(user1.equals(user2));
    }
}
