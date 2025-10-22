package org.example.Lesson11;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {
    public static void main(String[] args) {
        User user1 = new User(1, "Will");
        Admin admin1 = new Admin(2, "Dustin");
        Moderator moderator1 = new Moderator(3, "Steve");

        user1.sendMessage("Hi!!!");
        moderator1.sendMessage("Anyo");
        admin1.sendMessage("Hola!");

        moderator1.ban("Will");
        admin1.ban("Dustin");
        admin1.PermanentBan("Dustin");

        List<BaseUser> users = new ArrayList<>();
        users.add(user1);
        users.add(admin1);
        users.add(moderator1);
        System.out.println(users.size());
        for (BaseUser user : users) {
            user.sendMessage("Hello!");
            user.auth("abc", "123456");
        }
        user1.deleteAccount();
    }
}
