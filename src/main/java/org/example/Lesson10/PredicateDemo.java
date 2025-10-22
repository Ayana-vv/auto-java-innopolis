package org.example.Lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Item item1 = new Item("Яблоко", 100.25, 8.5);
        Item item2 = new Item("Груша", 233.25,9.5);
        Item item3 = new Item("Банан", 421, 4.5);

        List<Item> items = List.of(item1, item2, item3);

//        System.out.println(filter(items, 300));
//        System.out.println(rating(items, 8));
//        System.out.println(filterMin(items, 500));
        //predicate для мах цены
        Predicate<Item> predicatePriceUp = new Predicate<Item>() {
            @Override
            public boolean test(Item item) {
                return item.getPrice() > 200;
            }
        };
        System.out.println(filter(items, predicatePriceUp));

        //predicate для рейтинга
        Predicate<Item> predicateRating = new Predicate<Item>() {
            @Override
            public boolean test(Item item) {
                return item.getRating() > 8;
            }
        };
        System.out.println(filter(items, predicateRating));
    }

    //фильтрация по max price
    public static List<Item> filter(List<Item> allItems, Predicate<Item> predicate) {
        List<Item> filtered = new ArrayList<>();
        for (Item item: allItems) {
            if (predicate.test(item)) {
                filtered.add(item);
            }
        }
        return  filtered;
    }
//    //фильтрация по max rate
//    public static List<Item> rating(List<Item> allItems, int maxRate) {
//        List<Item> filtered = new ArrayList<>();
//        for (Item item: allItems) {
//            if (item.getRating() > maxRate) {
//                filtered.add(item);
//            }
//        }
//        return  filtered;
//    }
//    //фильтрация по min price
//    public static List<Item> filterMin(List<Item> allItems, int minPrice) {
//        List<Item> filtered = new ArrayList<>();
//        for (Item item: allItems) {
//            if (item.getPrice() < minPrice) {
//                filtered.add(item);
//            }
//        }
//        return  filtered;
//    }
}
