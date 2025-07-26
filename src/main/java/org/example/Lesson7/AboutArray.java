package org.example.Lesson7;

public class AboutArray {
    public static void main(String[] args) {
        String[] users = new String[10];
        users[0] = "100";
        users[1] = "150";
        users[3] = "1000";
        for (String u : users) {
            System.out.println(u);
        }
    }
}
