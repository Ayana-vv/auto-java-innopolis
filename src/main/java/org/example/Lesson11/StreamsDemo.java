package org.example.Lesson11;

import java.util.HashMap;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> players = new HashMap<>();
        players.put("RM", 100);
        players.put("JK", 55);
        players.put("Yohan", 23);
        players.put("Eunwoo", 223);
        players.put("Daniel", 58);

        System.out.println(players);
        System.out.println(players.keySet());
        System.out.println(players.values());

//        не желательно
//        Stream<Integer> stream = players.values().stream();
//        System.out.println(stream);
////        System.out.println(stream.toList());
//        System.out.println(stream.sorted().toList());

        //правильнее
        System.out.println(players.values().stream().sorted().toList());
        System.out.println(players.values().stream().sorted().filter(point -> point > 50).map(point -> point + 100).
                toList());


    }
}
