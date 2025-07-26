package org.example.Lesson7;

import java.util.ArrayList;
import java.util.List;

public class AboutArrayList {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>();
        users.add("Jin");
        users.add("IM");
        users.add(0, "Evan");

//        System.out.println(users.get(0));

//        users.remove("IM");
//        users.remove(0);
        for (String u : users) {
            System.out.println(u.length());
        }
        System.out.println(users.size());
    }
}
