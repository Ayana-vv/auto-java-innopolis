package org.example.Lesson3;

public class SocialNetwork {
    public static void main(String[] args) {
        //String name = "Михаил";
        User mihail = new User();
        System.out.println(mihail.name);
        mihail.name = "Михаил";
        System.out.println(mihail.name);
    }
}
