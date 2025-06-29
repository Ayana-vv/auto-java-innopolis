package org.example.Lesson5;

import java.util.Scanner;

public class AboutIf {
    public static void main(String[] args) {
        int age = new Scanner(System.in).nextInt();  //ввод переменных через терминал

        System.out.println(age < 12);
        if (age < 12) {
            System.out.println("Вы слишком молоды, подрастите :)");
        }
        else {
            System.out.println("Вы успешно зарегистрировались на нашем сайте!");
        }
    }
}
