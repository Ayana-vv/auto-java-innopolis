package org.example.Lesson12;

import org.example.Lesson11.Admin;
import org.example.Lesson11.Moderator;

public class VK {
    public static void main(String[] args) {
        on(Role.ADMIN);
    }

    public  static void on(Role role) {
        Moderator superUser;
        if (role == Role.MODERATOR) {
            superUser = new Moderator(1, "qwerty");
        }
        else if (role == Role.ADMIN) {
            superUser = new Admin(2, "Qszc");
        }
        else if (role == Role.SUPERADMIN) {
            superUser = new Admin(3, "test");
        }
        else {
            superUser = new Moderator(4, "Poiu");
        }
        superUser.auth("abc", "psw");
    }
}
