package org.example.Lesson9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Examples {
    public static void main(String[] args) throws IOException {

//        String pass = new Scanner(System.in).nextLine();

        Path filePath = Path.of("test.txt");

//        Files.writeString(filePath, pass);  //добавление файла
//        Files.writeString(filePath, pass, StandardOpenOption.WRITE); //замена строки
//        Files.writeString(filePath, "\n", StandardOpenOption.APPEND);  // добавление в строку энтера
//        Files.writeString(filePath, pass, StandardOpenOption.APPEND);  // добавление в строку
//        Files.writeString(filePath, pass, StandardOpenOption.CREATE_NEW);  //создание файла
//        Files.writeString(filePath, pass, StandardOpenOption.APPEND);

        String s = Files.readString(filePath);
        System.out.println(s);

        if (Files.exists(filePath)) {
            System.out.println("Файл есть ");
        }
//        if (Files.exists(Path.of("123.txt"))) {
//            System.out.println("Файл есть ");
//        }

        System.out.println(Files.isWritable(filePath));
    }
}
