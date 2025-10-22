package org.example.Lesson9;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Site {
    public static void main(String[] args) throws IOException {
        //Запись в файл
        BannedUser user1 = new BannedUser("Jin", "Kim", 33, "kim@ya.ru", 32000);
        BannedUser user2 = new BannedUser("JK", "Jeon", 28, "jk@ya.ru", 12000);
        BannedUser user3 = new BannedUser("IM", "Im", 29, "im@ya.ru", 22000);

        //создание объекта, который может записывать значения в json-файл
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("bannedUser.json"), user1);

        //Запись в файл нескольких объектов
//        BannedUser user1 = new BannedUser("Jin", "Kim", 33, "kim@ya.ru", 32000);
//        BannedUser user2 = new BannedUser("JK", "Jeon", 33, "kim@ya.ru", 32000);
//        BannedUser user3 = new BannedUser("IM", "Im", 29, "im@ya.ru", 22000);

//        List<BannedUser> bannedUsers = List.of(user1, user2, user3);
//        //List<Integer> numbers = List.of(1,2,3,5,8);

//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.writeValue(new File("bannedUser.json"), bannedUsers);

        //Считать из файла
        objectMapper = new ObjectMapper();
        BannedUser userFromFile = objectMapper.readValue(new File("banneduser.json"), BannedUser.class);
        System.out.println(userFromFile);
        userFromFile.setSalary(1000);

        System.out.println(userFromFile.getAge());
    }
}
